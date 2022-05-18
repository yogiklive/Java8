package com.learn.java8.lamdaExpressions;

public class TypeInferance {
	
	public static void main(String args[]){
		
		MyLamda lamda = (String s)->s.length();
		System.out.println(lamda.getLength("Yogesh"));
		printLamda(s ->s.length());//Type reference lamda is matched with the method in functional interface
			
	}
	
	public static void printLamda(MyLamda l){
		System.out.println(l.getLength("SoniyaRani"));
	}

	public interface MyLamda{
		public int getLength(String s);
	}
}
