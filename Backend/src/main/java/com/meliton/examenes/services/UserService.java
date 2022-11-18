package com.meliton.examenes.services;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.meliton.examenes.models.User;
import com.meliton.examenes.models.UserRole;
import com.meliton.examenes.repository.IRoleRepository;
import com.meliton.examenes.repository.IUserRepository;

@Service
public class UserService implements IUserService {
	
	
	@Autowired
	private IUserRepository userRepository;
	
	@Autowired
	private IRoleRepository roleRepository;
	
	@Override
	public User register(User user, Set<UserRole> userRoles) throws Exception{
		User userLocal = userRepository.findByUserName(user.getUserName());
		if(userLocal != null) {
			System.out.println("Usuario registrado en el sistema");
		}
		else{
			//guardar roles del usuario en la tabla de roles
		    for(UserRole userRole : userRoles) {
		    	roleRepository.save(userRole.getRole());
		    }
		    user.getUserRole().addAll(userRoles);
		  //guardar usuario en tabla User
		    userLocal = userRepository.save(user);
		}
		return userLocal;
	}
	
	@Override
	public User getUser(String Username) {
		return userRepository.findByUserName(Username);
	}
	@Override
	public void delete(Long UserId) {
		// TODO Auto-generated method stub
		
	}

	
	
	
}
