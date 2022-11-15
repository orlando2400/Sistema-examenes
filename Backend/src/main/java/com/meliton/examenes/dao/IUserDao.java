package com.meliton.examenes.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.meliton.examenes.models.User;

public interface IUserDao extends JpaRepository<User,Long>{
	public List<User> findByUserName(String userName);
}
