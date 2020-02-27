package com.ekart.model;

public class Product 
{
	private int productId;
	private String productName;
	private String productDescription;
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
