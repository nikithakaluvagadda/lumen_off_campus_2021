package com.training;

public class Electronics extends Product {
	private int warrantyMonths;

	@Override
	public int compareTo(Product o) {
		// TODO Auto-generated method stub
		return 0;
	}

	public Electronics(int warrantyMonths) {
		super();
		this.warrantyMonths = warrantyMonths;
	}

	public Electronics(String string, String string2, int i, long j) {
		super();
		// TODO Auto-generated constructor stub
	}
	
		
		Electronics e1=new Electronics("jb","mobile",25,15000);
		Electronics e2=new Electronics("b","laptop",14,40000);
		Electronics e3=new Electronics("jbkm","printer",3,55000);
		
	}

