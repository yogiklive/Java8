package com.learn.java8.Streams.collect;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.learn.java8.Streams.reduce.Employee;

public class GroupBy {

	public static void main(String args[]) {

		List<Employee> empList = Arrays.asList(new Employee("Sachin", 45, 1000.00, "Male"),
				new Employee("Dravid", 46, 900.00, "Male"), new Employee("Mithali", 40, 1200.00, "Female"));

		// Groupby based on Gender
		Map<String, Long> empMap = empList.stream()
				.collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));

		System.out.println(empMap);
	}

}
