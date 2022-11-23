package com.meliton.examenes.controllers;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.meliton.examenes.models.Role;
import com.meliton.examenes.models.User;
import com.meliton.examenes.models.UserRole;
import com.meliton.examenes.services.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@PostMapping("/register")
	public User register(@RequestBody User user) throws Exception {
		
		Set<UserRole> roles = new HashSet<>();
		
		Role role = new Role();
		role.setId(2L);
		role.setName("Estudiante");
		
		UserRole userRole = new UserRole();
		userRole.setUser(user);
		userRole.setRole(role);
		
		roles.add(userRole);
		
		return userService.register(user, roles);
		
	}
	//Método get para obtener un usuario por su nombre de user
	@GetMapping("/{userName}")
	public User getUser(@PathVariable("userName") String userName) {
		return userService.getUser(userName);
	}
	
	//Método delete para eliminar un usuario por su nombre de user
	@DeleteMapping("/{userId}")
	public void deleteUser(@PathVariable ("userId") Long userId) {
		userService.delete(userId);
	}
}
