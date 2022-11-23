package com.meliton.examenes.models;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter @Setter
@AllArgsConstructor @NoArgsConstructor
@Table( name = "user")
public class User{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String userName;
	private String password;
	private String names;
	private String surnames;
	private String email;
	private boolean enabled = true;
	private String perfil;
	@JsonIgnore
	@OneToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY,mappedBy = "user")
	private Set<UserRole>userRole = new HashSet<>();
}
