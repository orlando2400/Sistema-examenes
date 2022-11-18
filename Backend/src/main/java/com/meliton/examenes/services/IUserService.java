package com.meliton.examenes.services;

import java.util.Set;
import com.meliton.examenes.models.User;
import com.meliton.examenes.models.UserRole;

public interface IUserService {
	
	public User register(User user, Set<UserRole> userRoles) throws Exception;
	public User getUser(String Username);
	public void delete(Long UserId);
}
