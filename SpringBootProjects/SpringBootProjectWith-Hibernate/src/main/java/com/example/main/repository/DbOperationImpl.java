package com.example.main.repository;

import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import com.example.main.config.HibernateConfig;
import com.example.main.entities.User;

@Repository
public class DbOperationImpl implements DbOperation {

	@Override
	public User getUserDetails(Long id) {
	User user = null;
		try(
			Session session =HibernateConfig.getSessionFactory().openSession();
				) {
		user =	session.get(User.class, 1L);

		} catch (Exception e) {
			e.printStackTrace();
			
		}
		return user;
	}

	
}
