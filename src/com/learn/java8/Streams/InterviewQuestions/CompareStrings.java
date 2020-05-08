package com.learn.java8.Streams.InterviewQuestions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//To find pair of elements in a list which sums up to 8
public class CompareStrings {
	
	public static void main(String args[]){
		
		/*String str1 = "ABC";
		String str2 = "BC";*/
		
		String str1 = "BC";
		String str2 = "BANGALORE";
		
		String[] str1Array = str1.split("");
		String[] str2Array = str2.split("");
		
		List<String> strList1 = Arrays.asList(str1Array);
		List<String> strList2 = Arrays.asList(str2Array);
		
		
		List<String> exclList1 = strList1.stream()
				.filter(p -> !strList2.contains(p)).collect(Collectors.toList());
		
		List<String> exclList2 = strList2.stream()
				.filter(p -> !strList1.contains(p)).collect(Collectors.toList());
		
		System.out.println("Elements in String1 excluding String 2");
		exclList1.forEach(System.out::println);
		
		System.out.println("Elements in String2 excluding String 1");
		exclList2.forEach(System.out::println);
		
		
		
	}

}
