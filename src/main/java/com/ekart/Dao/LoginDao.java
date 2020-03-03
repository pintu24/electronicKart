package com.ekart.Dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ekart.model.User;

@Component
public class LoginDao {

	@Autowired
	SessionFactory factory;
	
	public User testLogin(User user)
	{
		Session session=factory.openSession();
		Query query=session.createQuery("from User where username=:un and password=:pswd");
		query.setParameter("un", user.getUserName());
		query.setParameter("pswd", user.getPassword());
		User user2=(User)query.uniqueResult();
		if(user2!=null)
		{
			return user2;
		}
		else
		{
			return null;
		}
	}
}
