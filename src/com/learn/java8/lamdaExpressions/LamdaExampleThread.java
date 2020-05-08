package com.learn.java8.lamdaExpressions;

public class LamdaExampleThread {
	
	public static void main (String args[]){
	
		Thread myThread = new Thread(new Runnable() {
			
			@Override
			public void run() {
            System.out.println("Printed inside runnable");				
			}
		});
		
		myThread.start();
		
		
		Thread lambdaThread = new Thread ( ()->System.out.println("Printed inside runnable"));
		lambdaThread.start();
	}
	
	

}
