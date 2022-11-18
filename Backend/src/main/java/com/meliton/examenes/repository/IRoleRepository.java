package com.meliton.examenes.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.meliton.examenes.models.Role;

public interface IRoleRepository extends JpaRepository<Role,Long> {
	
}
