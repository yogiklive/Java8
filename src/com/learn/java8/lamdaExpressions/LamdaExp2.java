package com.learn.java8.lamdaExpressions;

public class LamdaExp2 {
	
	public static void main (String args[]){
		SysoInterface interfacePrint = () -> System.out.println("Welcome!!!");
		
		interfacePrint.print();
				
				
	}
	
	public interface SysoInterface {
		
		void print();
		
	}

}
