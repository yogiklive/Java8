package com.learn.java8.lamdaExpressions;

import java.util.function.Consumer;

public class ClosureExample {
	
	public static void main(String args[]){
		int a = 10;
		int b = 20; //effectively final 
		doProcess(a,i -> System.out.println(i+b));
	}

	private static void doProcess(int a, Consumer<Integer> consumer) {
		consumer.accept(a);//lamda exp is executed here which does not know the value of b 
		                   // but jvm considers that to be final and passes on the value of b
	}
	
}


