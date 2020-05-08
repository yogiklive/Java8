package com.learn.java8.Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsVariousOperations {
	
	public static void main(String args[]){
		
		
		List<String> strList = Arrays.asList("Sachin","Dravid","Ganguly","Sehwag");
  
		
		
		
		//Filter takes in predicate as argument
		//used to filter the collection
		strList.stream()
		.filter(p->p.startsWith("S"))
		.forEach(System.out::println);
		
		//Intermediate function does not work without Terminal functions
		//This is called Laziness
		strList.stream()
		.filter(p->p.startsWith("S"));
		
		//sorted: The sorted method is used to sort the stream.
		strList.stream()
		.sorted()
		.forEach(p -> System.out.println("sorted Elements " + p));
		
		//Takes in a function and performs the function for each element of the collection
		//Returns a stream post performing the function
		strList.stream()
		.map(p->p.toUpperCase())
		.forEach(System.out::println);
		
		//collect: The collect method is used to return the result of the intermediate operations performed on the stream.
		 List<String> strName =strList.stream()
		.map(p->p.toLowerCase())
		.collect(Collectors.toList());
		 
		 strName.forEach(System.out::println);
		 
		 //the flatMap() function is used to convert a Stream of Stream into a list of values
		 List<String> strList2 = Arrays.asList("Yuvaraj","Kholi","Bumra","Dhoni");
		 
		 List<List<String>> listOfList = new ArrayList<List<String>>();
		 listOfList.add(strList);
		 listOfList.add(strList2);
				
		 listOfList.stream()
		 .flatMap(p -> p.stream())
		 .collect(Collectors.toList());
	}

}
