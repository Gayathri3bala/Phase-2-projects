package com.ecommerce;

import java.math.BigDecimal;

public class EProduct {
	private long ID;
	private String name;
	private BigDecimal price;

	public EProduct() {

	}

	public EProduct(long id, String name, BigDecimal price) {
		this.ID = id;
		this.name = name;
		this.price = price;

	}

	public long getID() {
		return this.ID;
	}

	public String getName() {
		return this.name;
	}

	public BigDecimal getPrice() {
		return this.price;
	}

	public void setID(long id) {
		this.ID = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

}
