package com.meliton.examenes.controllers;

import java.util.Set;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.meliton.examenes.models.User;
import com.meliton.examenes.models.UserRole;
import com.meliton.examenes.services.UserService;

@RestController
@RequestMapping(name = "/user")
public class UserController {
	
	private UserService userService;
	
	@PostMapping(name = "/register")
	public void register(@RequestBody User user, Set<UserRole> userRoles) throws Exception {
		userService.register(user, userRoles);
	}
}
