package com.meliton.examenes.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import com.meliton.examenes.models.User;

public interface IUserRepository extends JpaRepository<User,Long>{
	public User findByUserName(String userName);
}
