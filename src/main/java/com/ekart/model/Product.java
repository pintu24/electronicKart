package com.ekart.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ekartproducts")
public class Product 
{
	@Id
	private int productId;
	@Column
	private String productName;
	@Column
	private String productDescription;
	@Column
	private int productPrice;
	
	public Product(int productId,String productName,String productDescription,int productPrice)
	{
		this.productId=productId;
		this.productName=productName;
		this.productDescription=productDescription;
		this.productPrice=productPrice;
	}

	public int getProductId() {
		return productId;
	}

	public String getProductName() {
		return productName;
	}

	public String getProductDescription() {
		return productDescription;
	}

	public int getProductPrice() {
		return productPrice;
	}
	
	
}
