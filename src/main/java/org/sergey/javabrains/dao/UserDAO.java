package org.sergey.javabrains.dao;

import org.sergey.javabrains.domain.User;

public interface UserDAO {
	
	Long create(User user);
	
	User getUserById(Long id);

}
