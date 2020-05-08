package com.learn.java8.Streams.reduce;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ReducingWithStreams {

	public static void main(String args[]) {

		List<Employee> employeeList = Arrays.asList(new Employee("Sachin", 42, 1000.123),
				new Employee("Ganguly", 43,500.342), new Employee("Dravid", 42, 600.456));

		Double totalSalary = employeeList.stream().map(p -> p.getSalary()).reduce(0.00, (a, b) -> a + b);
		
		/*Optional<Double> totalSalary = employeeList.stream()
		.map((Employee e) -> e.getSalary())
		.reduce((a,b)-> a+b);*/
		

		System.out.println("totalSalary " + totalSalary);
		
		//To get maximum salary from list of Employees
		Optional<Employee> maxSalary = employeeList.stream()
				           .reduce((a,b) -> a.getSalary()>b.getSalary() ? a:b);
		
		if(maxSalary.isPresent()){
			System.out.println("maxSalary " + maxSalary);
		}
	}

}
