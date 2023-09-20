package com.example.beket.kz.utils;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.io.Decoders;
import io.jsonwebtoken.security.Keys;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;

import java.security.Key;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

@Component
public class JwtTokenUtils {
	@Value("${application.security.jwt.secret-key}")
	private String secretKey;
	@Value("${application.security.jwt.expiration}")
	private long jwtExpiration;
	@Value("${application.security.jwt.refresh-token.expiration}")
	private long refreshExpiration;

	public String extractUsername(String token) {
		String username;
		try {
			final Claims claims = this.extractAllClaims(token);
			username = claims.getSubject();
		} catch (Exception e) {
			username = null;
		}
		return username;
	}

	public <T> T extractClaim(String token, Function<Claims, T> claimsResolver) {
		final Claims claims = extractAllClaims(token);
		return claimsResolver.apply(claims);
	}

	public String generateToken(
			UserDetails userDetails
	) {
		Map<String, Object> extraClaims = new HashMap<>();
		List<String> rolesList = userDetails.getAuthorities().stream()
				.map(GrantedAuthority::getAuthority)
				.toList();
		extraClaims.put("permissions",rolesList);
		return buildToken(extraClaims, userDetails, jwtExpiration);
	}

	public String generateRefreshToken(
			UserDetails userDetails
	) {
		return buildToken(new HashMap<>(), userDetails, refreshExpiration);
	}

	private String buildToken(
			Map<String, Object> extraClaims,
			UserDetails userDetails,
			long expiration
	) {
		return Jwts.builder()
				.setClaims(extraClaims)
				.setSubject(userDetails.getUsername())
				.setIssuedAt(new Date(System.currentTimeMillis()))
				.setExpiration(new Date(System.currentTimeMillis() + expiration))
				.signWith(getSignInKey(),SignatureAlgorithm.HS256)
				.compact();
	}

	public boolean isTokenValid(String token, UserDetails userDetails) {
		final String username = extractUsername(token);
		return (username.equals(userDetails.getUsername())) && !isTokenExpired(token);
	}

	private boolean isTokenExpired(String token) {
		return extractExpiration(token).before(new Date());
	}

	private Date extractExpiration(String token) {
		return extractClaim(token, Claims::getExpiration);
	}

	private Claims extractAllClaims(String token) {
		Claims claims;
		try {
			claims = Jwts.parser()
					.setSigningKey(secretKey)
					.parseClaimsJws(token)
					.getBody();
		} catch (Exception e) {
			claims = null;
		}
		return claims;
	}

	private Key getSignInKey() {
		byte[] keyBytes = Decoders.BASE64.decode(secretKey);
		return Keys.hmacShaKeyFor(keyBytes);
	}
	public List<String> getRoles(String token) {
		List<String> roles = extractAllClaims(token).get("roles", List.class);
		if (roles == null) {
			return Collections.emptyList(); // вернуть пустой список
		}
		return roles;
	}

}