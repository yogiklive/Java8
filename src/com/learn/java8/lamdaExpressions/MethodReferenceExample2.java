package com.learn.java8.lamdaExpressions;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class MethodReferenceExample2 {

	public static void main(String args[]) {
		List<Person> personList = Arrays.asList(new Person("Yogesh", "K", 32),
				                                new Person("Sachin", "Tendulkar", 45));
		//printConditionally(personList,p->p.getFirstName().equals("Yogesh"),(p)->System.out.println(p));
		
		printConditionally(personList,p->p.getFirstName().equals("Yogesh"),System.out::println);

	}

	private static void printConditionally(List<Person> personList, Predicate<Person> predicate, Consumer<Person> consumer) {

		for(Person person : personList){
			
			if(predicate.test(person)){
				consumer.accept(person);
			}
			
		}
	}
}
