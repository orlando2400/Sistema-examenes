package com.meliton.examenes.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.meliton.examenes.models.User;
import com.meliton.examenes.repository.IUserRepository;

public class UserDetailsServiceImpl implements UserDetailsService{
	
	@Autowired
	IUserRepository UserRepository;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		User user = UserRepository.findByUserName(username);
		if(user == null) {
			throw new UsernameNotFoundException("Usuario no encontrado en el sistema");
		}
		return user;
	}
	
}
