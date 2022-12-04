package com.meliton.examenes.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor @AllArgsConstructor 
public class JwtRequest {
	@Getter
	private String username;
	private String password;
	
}
