package com.ekart.Dao;



import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
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
	
	public List getProducts()
	{
		Session session=sessionFactory.openSession();
		Query query=session.createQuery("from Product");
		List<Product>list=query.list();
		for(Product product:list)
		{
			
		}
		session.close();
		return list;
	}
	
	public Product getSingleProduct(int proId)
	{
		Session session=sessionFactory.openSession();
		Query query =session.createQuery("from Product where productid=:pid");
		query.setParameter("pid", proId);
		Product product=(Product)query.uniqueResult();
		session.close();
		return product;
	}
}
