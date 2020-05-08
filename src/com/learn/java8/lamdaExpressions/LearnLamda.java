package com.learn.java8.lamdaExpressions;

public class LearnLamda {

	public static void main(String args[]) {
		print((s)->s.length());
	}

	private static void print(PrintLenLambda type) {
		System.out.println(type.foo("Hello World"));
		
	}

	public interface PrintLenLambda{
		
		public int foo(String s);
		
	}
}
