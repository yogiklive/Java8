package com.learn.java8.lamdaExpressions;

public class MethodReferenceExample1 {

	public static void main(String args[]){
		
		Thread t = new Thread(()->printMessage());
		t.start();
		
		//When the argument of lamda and the argument of the method is null or same
		//we can replace them with class name :: method name
		
		Thread t1 = new Thread(MethodReferenceExample1::printMessage);
		t1.start();
	}
	
	public static void printMessage(){
		
		System.out.println("hi");
	}
}
