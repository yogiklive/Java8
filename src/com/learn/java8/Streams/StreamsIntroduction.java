package com.learn.java8.Streams;

import java.util.Arrays;
import java.util.List;

import com.learn.java8.lamdaExpressions.Person;

public class StreamsIntroduction {

	public static void main(String[] args) {

		List<Person> personList = Arrays.asList(new Person("Sachin", "Tendulkar", 42),
				new Person("Rahul", "Dravid", 43), new Person("Sourav","Ganguly",43));

		personList.stream().filter(p -> p.getFirstName().startsWith("S"))
		.forEach(p -> System.out.println(p));

		// Parallel Processing
		personList.parallelStream().filter(p -> p.getLastName().startsWith("D"))
		.forEach(System.out::println);
		
		//anyMatch
		/*Stream anyMatch(Predicate predicate) returns whether any elements of this stream match the provided predicate.
		It may not evaluate the predicate on all elements if not necessary for determining the result. 
		This is a short-circuiting terminal*/
		boolean present = personList.stream()
		.anyMatch(p ->p.getFirstName().equals("Sachin"));
		
		System.out.println(present);
		
	}
}
