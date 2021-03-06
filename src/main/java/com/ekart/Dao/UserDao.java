package com.ekart.Dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ekart.model.User;

@Component
public class UserDao {

	@Autowired
	SessionFactory sessionFactory;
	
	public void testSessionFactory()
	{
		System.out.println("session factory____________"+sessionFactory);
	}
	
	public void insertUser(User user)
	{
		Session session=sessionFactory.openSession();
		session.save(user);
		Transaction transaction=session.beginTransaction();
		transaction.commit();
		session.close();
	}
}
