package com.learn.java8.lamdaExpressions;

public interface Greeting {
	
	public void perform();
	
	default void foo(){
		System.out.println("Default implementations are allowed post java 8");
	}

}
