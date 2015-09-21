package org.sergey.javabrains.dto;

import org.sergey.javabrains.domain.User;

public class UserDTO extends User {

	public UserDTO copy(User user) {
		UserDTO udto = new UserDTO();
		udto.setUserId(user.getUserId());
		udto.setFirstName(udto.getFirstName());
		udto.setLastName(user.getLastName());
		udto.setEmail(user.getEmail());
		udto.setPassword(user.getPassword());
		udto.setBirthDate(user.getBirthDate());
		udto.setConfirmationEmailSent(user.getConfirmationEmailSent());
		udto.setUserConfirmed(user.getUserConfirmed());
		return udto;
	}

}
