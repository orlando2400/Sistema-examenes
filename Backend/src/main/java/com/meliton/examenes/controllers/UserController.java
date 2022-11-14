package com.meliton.examenes.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.meliton.examenes.services.UserService;

@RestController
@RequestMapping(name = "/user")
public class UserController {
	
	private UserService userService;
	
	@PostMapping(name = "/register")
	public void register() {
		userService.register();
	}
}
