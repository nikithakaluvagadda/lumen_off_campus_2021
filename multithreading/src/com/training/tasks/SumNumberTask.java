package com.training.tasks;

public class SumNumberTask implements Runnable {

	private int countTo;
	
	
	public SumNumberTask(int countTo) {
		super();
		this.countTo = countTo;
	}


	@Override
	public void run() {

		int sum =0;
		for(int i=0;i<=countTo;i++) {
			
			sum=sum+i;
		}
		
		System.out.println("thread name:"+Thread.currentThread().getName() +" =Result = "+sum);
	}

	
	
}
