package com.learn.java8.MethodReference;

public class MethodReference1 {

	public static void main(String args[]) {

		Thread t = new Thread(new Runnable() {

			@Override
			public void run() {
				System.out.println("hi from thread ==> Ananoymous inner class");

			}
		});
		t.start();

		Thread t1 = new Thread(() -> System.out.println("hi from thread ==> lamda"));
		t1.start();

		Thread t2 = new Thread(() -> process()); // This is a pass through, it
													// is just calling a method
													// Hence it can be replaced
													// with method reference
		t2.start();

		Thread t3 = new Thread(MethodReference1::process);
		t3.start();

	}

	private static void process() {
		System.out.println("hi from process method");
	}

}
