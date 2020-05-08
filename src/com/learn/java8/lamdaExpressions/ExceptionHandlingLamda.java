package com.learn.java8.lamdaExpressions;

import java.util.function.BiConsumer;

public class ExceptionHandlingLamda {

	public static void main(String args[]) {

		int[] arr = { 2, 3, 8, 5, 4, 1 };

		int key = 5;

		process(arr, key,(v,k)->System.out.println(v+k));
		
	}

	private static void process(int[] arr, int key, BiConsumer<Integer, Integer> consumer) {

		for (Integer temp : arr) {
			consumer.accept(temp, key);
		}

	}

}
