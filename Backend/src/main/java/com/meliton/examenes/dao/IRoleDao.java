package com.meliton.examenes.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.meliton.examenes.models.Role;

public interface IRoleDao extends JpaRepository<Role,Long> {
	
}
