package org.sergey.javabrains.service;

import org.sergey.javabrains.dao.UserDAO;
import org.sergey.javabrains.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	UserDAO userDAO;
	
	public Long save(User user) {
		return userDAO.create(user);
	}
	
	

}
