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
	
	

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}

	public void setProductPrice(int productPrice) {
		this.productPrice = productPrice;
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
