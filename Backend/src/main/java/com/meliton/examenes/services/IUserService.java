package com.meliton.examenes.services;

import java.util.List;

import com.meliton.examenes.models.User;
import com.meliton.examenes.models.UserRole;

public interface IUserService {
	
	public void register(User user, List<UserRole> userRoles);
	public void login();
}
