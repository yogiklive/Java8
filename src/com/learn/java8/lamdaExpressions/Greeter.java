package com.learn.java8.lamdaExpressions;

public class Greeter {

	public static void main(String args[]) {
		Greeter greeter = new Greeter();

		HelloWorldGreeting helloWorldGreeting = new HelloWorldGreeting();
		greeter.greet(helloWorldGreeting);
	
		Greeting greet = ()->System.out.println("Using Lamda");
		greet.perform();

	}

	private void greet(Greeting greeting) {
		greeting.perform();
	}

}
