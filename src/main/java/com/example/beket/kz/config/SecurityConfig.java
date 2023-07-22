package com.example.beket.kz.config;

import com.example.beket.kz.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.HttpStatusEntryPoint;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

@Configuration
@EnableWebSecurity
@EnableMethodSecurity
public class SecurityConfig {
	@Bean
	public UserService userService() {
		return new UserService();
	}
	@Autowired
	private JwtRequestFilter jwtRequestFilter;

	@Bean
	public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
		http.exceptionHandling().accessDeniedPage("/403-page");

		AuthenticationManagerBuilder builder =
				http.getSharedObject(AuthenticationManagerBuilder.class);
		builder.userDetailsService(userService()).passwordEncoder(passwordEncoder());

		http.cors().disable().authorizeHttpRequests()
				.requestMatchers("/api").authenticated()
				.dispatcherTypeMatchers(HttpMethod.valueOf("/user")).authenticated()
						.requestMatchers("/admin").hasRole("ADMIN")
						.shouldFilterAllDispatcherTypes(true).anyRequest().permitAll()
						.and().exceptionHandling().authenticationEntryPoint(new HttpStatusEntryPoint(HttpStatus.UNAUTHORIZED))
				.and().addFilterBefore(jwtRequestFilter, UsernamePasswordAuthenticationFilter.class);
		http.logout()
				.logoutUrl("/sign-out"); // post request to /sign-out

		http.csrf().disable();

		return http.build();
	}


	@Bean
	public BCryptPasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}

	@Bean
	public AuthenticationManager authenticationManager(AuthenticationConfiguration authenticationConfiguration) throws Exception {
		return authenticationConfiguration.getAuthenticationManager();
	}
}