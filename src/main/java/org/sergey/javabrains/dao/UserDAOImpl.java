package org.sergey.javabrains.dao;

import org.hibernate.Transaction;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.sergey.javabrains.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserDAOImpl implements UserDAO{
	
	@Autowired
	SessionFactory sessionFactory;
	
	public Long create(User user) {
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		Long id = (Long) session.save(user);
		tx.commit();
		session.close();
		return id;
	}

}
