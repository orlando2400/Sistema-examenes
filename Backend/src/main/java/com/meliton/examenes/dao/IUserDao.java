package com.meliton.examenes.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.meliton.examenes.models.User;

public interface IUserDao extends JpaRepository<User,Long>{
	
}
