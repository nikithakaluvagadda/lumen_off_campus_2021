package com.training;

import java.time.LocalDate;

public class FoodItem extends Product {
	private LocalDate mfgDate;
	private LocalDate expirtyDate;
	private boolean isVegetarian;
	public FoodItem(LocalDate mfgDate, LocalDate expirtyDate, boolean isVegetarian) {
		super();
		this.mfgDate = mfgDate;
		this.expirtyDate = expirtyDate;
		this.isVegetarian = isVegetarian;
	}
	public FoodItem(String string, String string2, int i, int j) {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public int compareTo(Product o) {
		// TODO Auto-generated method stub
		return 0;
	}
	FoodItem f1=new FoodItem("a","milk",5,40);
	FoodItem f2=new FoodItem("b","sugar",4,35);
	FoodItem f3=new FoodItem("c","rice",3,150);
}
