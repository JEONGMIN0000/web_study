package com.app.service.user.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dao.user.UserDAO;
import com.app.dto.user.User;
import com.app.service.user.UserService;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	UserDAO userDAO;

	@Override
	public int saveUser(User user) {
		int result = userDAO.saveUser(user);
		return result;
	}

	@Override
	public int saveCustomerUser(User user) {
		user.setUserType("CUS");
		int result = userDAO.saveUser(user);
		return result;
	}

	@Override
	public int saveAdminUser(User user) {
		user.setUserType("ADM");
		int result = userDAO.saveUser(user);
		return result;
	}

}
