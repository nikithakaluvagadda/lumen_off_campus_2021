package com.training;

public abstract class Product implements Comparable<Product> {
	private int itemCode;
	private String itemName;
	private double quantity;
	private double unitPrice;
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getItemCode() {
		return itemCode;
	}
	public void setItemCode(int itemCode) {
		this.itemCode = itemCode;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public double getQuantity() {
		return quantity;
	}
	public void setQuantity(double quantity) {
		this.quantity = quantity;
	}
	public double getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}
	@Override
	public String toString() {
		return this.itemCode +" ," +this.itemName+", "  +this.quantity+"," + this.quantity +" ,"+this.unitPrice+" , ";
	}
	@Override
	public int compareTo(Product o) {
		// TODO Auto-generated method stub
		return 0;
	}
	public Product(int itemCode, String itemName, double quantity, double unitPrice) {
		super();
		this.itemCode = itemCode;
		this.itemName = itemName;
		this.quantity = quantity;
		this.unitPrice = unitPrice;
	}
	
		
	}

