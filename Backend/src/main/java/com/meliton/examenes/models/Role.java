package com.meliton.examenes.models;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter @Setter
@AllArgsConstructor @NoArgsConstructor
@Table(name = "role")
public class Role {
	@Id
	private Long id;
	private String name;
	@OneToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER,mappedBy = "role")
	private List<UserRole> userRole = new ArrayList<>();
}
