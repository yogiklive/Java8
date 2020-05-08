package com.learn.java8;

import java.util.Arrays;
import java.util.List;

import com.learn.java8.lamdaExpressions.Person;

public class CollectionItertionExp {

	public static void main(String args[]){
		
		List<Person> personList = Arrays.asList(new Person("Sachin","Tendulkar",32),
				new Person("Rahul","Dravid",32));
		
		//External iterator single threaded
		for(int i=0;i<personList.size();i++){
			System.out.println("Printing from for loop " + i);
		}
		
		for(Person p:personList){
			System.out.println("Printing from for in loop "+ p);
		}
		
		//Multi threaded run time decides on how to iterate
		//personList.forEach(p->System.out.println("Printing from for each" + p));
		personList.forEach(System.out::println);
		
	}
}
