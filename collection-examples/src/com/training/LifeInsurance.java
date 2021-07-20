package com.training;

public class LifeInsurance extends Insurance {
	private int age;

	public LifeInsurance(String policyHolderName, double policyAmount) {
		super(policyHolderName, policyAmount);
		this.age=age;
	}

	@Override
	public double calculatePremium() {
		// TODO Auto-generated method stub
		return super.calculatePremium();
	}
	
	
}
