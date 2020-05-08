package com.learn.java8.lamdaExpressions;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class ExcerciseUsingJava8 {

	public static void main(String args[]) {

		List<Person> personList = Arrays.asList(

		new Person("Sachin", "Tendulkar", 43), new Person("Rahul", "Dravind", 42), new Person("Sai", "Krithika", 2),
				new Person("Virat", "Kholi", 33), new Person("Yogesh", "KamalaKannan", 32));

		// Sort elements in list
		sort(personList);

		// print elements in List
		printPersonConditionally(personList,p->true,p->System.out.println(p));

		
		System.out.println("Printing Person starting with first name S");
		// print person with first name beginning with S
		printPersonConditionally(personList,p -> p.getFirstName().startsWith("S"),p->System.out.println(p));
		
		System.out.println("Printing Person starting with Last name K");
		// print person with Last name beginning with K
		printPersonConditionally(personList,p->p.getLastName().startsWith("K"),p->System.out.println(p.getFirstName()));
		

	}

	private static void printPersonConditionally(List<Person> personList,Predicate<Person> p,Consumer<Person> consumer) {
		
		

		for (Person person : personList) {

			if (p.test(person)) {
				consumer.accept(person);
			}

		}
	}

	private static void printList(List<Person> personList) {
		
		System.out.println("Printing all Persons");

		for (Person person : personList) {

			System.out.println(person);

		}
	}

	private static void sort(List<Person> personList) {

		Collections.sort(personList,(p1,p2)->p1.getFirstName().compareTo(p2.getFirstName()));
	}
	
	/*public interface Condition{
		boolean test(Person p);
		}*/

}
