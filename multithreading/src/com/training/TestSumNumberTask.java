package com.training;
import com.training.tasks.SumNumberTask;

public class TestSumNumberTask {

	public static void main(String[] args) {
		//superType=subType => always allowed
		Runnable countToFive= new SumNumberTask(5);
		Runnable countToTen= new SumNumberTask(10);
		Thread t1=new Thread(countToFive,"five count");
		Thread t2=new Thread(countToTen,"ten count");
		t1.start();//runnable
		t2.start();//runnable
		//Runnable countToHundred= new SumNumberTask(100);
		//countToHundred.run(); it calls main method we should not follow this kind and run() should not call in this way
		
	
	}
	

}
