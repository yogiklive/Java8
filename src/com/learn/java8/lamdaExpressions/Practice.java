package com.learn.java8.lamdaExpressions;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Practice {

	public static void main(String args[]) {

		List<Person> personList = Arrays.asList(new Person("Sai", "Krithika", 2),
				new Person("Soniya", "Rani", 28),new Person("Yogesh","KamalaKannan",32));
		
		Collections.sort(personList,(p1,p2)-> p1.getLastName().compareTo(p2.getLastName()));
		
		//print(personList);
		
		printFirstNameWithS(personList,(p)->p.getFirstName().startsWith("S"),(p)->System.out.println(p));
		
	}

	private static void printFirstNameWithS(List<Person> personList, Predicate<Person> predicate,Consumer<Person> consumer) {
		for(Person p: personList){
			if(predicate.test(p)){
				consumer.accept(p);
				
			}
		}
		
	}

	private static void print(List<Person> personList) {

		for(Person p: personList){
			System.out.println();
		}
	}

	

}
