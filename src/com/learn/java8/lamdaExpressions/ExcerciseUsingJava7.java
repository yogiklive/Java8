package com.learn.java8.lamdaExpressions;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ExcerciseUsingJava7 {

	public static void main(String args[]) {

		List<Person> personList = Arrays.asList(

		new Person("Sachin", "Tendulkar", 43), new Person("Rahul", "Dravind", 42), new Person("Sai", "Krithika", 2),
				new Person("Virat", "Kholi", 33), new Person("Yogesh", "KamalaKannan", 32));

		// Sort elements in list
		sort(personList);

		// print elements in List
		printList(personList);

		
		System.out.println("Printing Person starting with first name S");
		// print person with first name beginning with S
		printPersonConditionally(personList,new Condition(){

			@Override
			public boolean test(Person p) {
				return p.getFirstName().startsWith("S");
			}
			
		});
		
		System.out.println("Printing Person starting with Last name K");
		// print person with Last name beginning with K
		printPersonConditionally(personList,new Condition(){

			@Override
			public boolean test(Person p) {
				return p.getLastName().startsWith("K");
			}
			
		});
		

	}

	private static void printPersonConditionally(List<Person> personList,Condition C) {
		
		

		for (Person person : personList) {

			if (C.test(person)) {
				System.out.println(person);
			}

		}
	}

	private static void printList(List<Person> personList) {
		
		System.out.println("Printing all Persons");

		for (Person person : personList) {

			System.out.println(person);

		}
	}

	private static void sort(List personList) {

		Collections.sort(personList, new Comparator<Person>() {

			@Override
			public int compare(Person p1, Person p2) {
				return p1.getFirstName().compareTo(p2.getFirstName());

			}
		});
	}
	
	
	}

 interface Condition{
	boolean test(Person p);
	}
