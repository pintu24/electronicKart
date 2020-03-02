package com.ekart.Dao;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ekart.model.Product;

@Component
public class ProductDao
{
	@Autowired
	SessionFactory sessionFactory;
	
	public void insertProduct(Product product)
	{
		Session session=sessionFactory.openSession();
		session.save(product);
		Transaction transaction=session.beginTransaction();
		transaction.commit();
		session.close();
	}
}
