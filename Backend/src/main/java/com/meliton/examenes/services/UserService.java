package com.meliton.examenes.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.meliton.examenes.dao.IRoleDao;
import com.meliton.examenes.dao.IUserDao;
import com.meliton.examenes.models.User;
import com.meliton.examenes.models.UserRole;

@Service
public class UserService implements IUserService {
	
	@Autowired
	private IUserDao userDao;
	
	@Autowired
	private IRoleDao roleDao;
	
	@Override
	public void register(User user, List<UserRole> userRoles) {
		User userlocal = (User) userDao.findByUserName(user.getUserName());
	}
	@Override
	public void login() {
		// TODO Auto-generated method stub
		
	}

	
	
	
}
