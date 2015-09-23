package org.sergey.javabrains.service;

import org.sergey.javabrains.domain.User;

public interface UserService {
	
	Long save(User user);
	
	User getUserById(Long id);

}
