package com.example.beket.kz.model;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.List;

@Entity
@Table(name = "users")
@Getter
@Setter
public class User extends BaseModel implements UserDetails {

	@Column(name = "email")
	private String email;

	@Column(name = "name")
	private String name;

	@Column(name = "surname")
	private String surname;

	@Column(name = "password")
	private String password;

	@ManyToOne
	private Countries citizenship_id;

	@Column(name = "patronymic")
	private String patronymic;


	@Column(name = "numberOfDocument")
	private String numberOfDocument;

	@Column(name = "phoneNumber")
	private String phoneNumber;

	@ManyToOne
	private DocumentType documentType;

	@ManyToMany(fetch = FetchType.EAGER)
	private List<Permissions> permissions;

	@Column(name = "dateOfBirth")
	private String dateOfBirth;

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		return this.permissions;
	}

	@Override
	public String getPassword() {
		return this.password;
	}

	@Override
	public String getUsername() {
		return this.email;
	}

	@Override
	public boolean isAccountNonExpired() {
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		return true;
	}

	@Override
	public boolean isEnabled() {
		return true;
	}
}
