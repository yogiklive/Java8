package com.learn.java8.Streams.collect;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.learn.java8.Streams.reduce.Employee;

public class CollectPartionBy {

	public static void main(String[] args) {

		List<Employee> employeeList = Arrays.asList(new Employee("Sachin", 42, 1000.123, "Male"),
				new Employee("Ganguly", 43, 500.342, "Male"), new Employee("Mithali", 42, 600.456, "Female"));

		Map<Boolean, List<Employee>> empMap = employeeList.stream()
				.collect(Collectors.partitioningBy((Employee emp) -> emp.getSalary() > 42));

		empMap.forEach((Boolean key, List<Employee> empList) -> System.out.println(key + "-->" + empList));

		List<String> nameList = Arrays.asList("Sachin", "Dravid");

		employeeList.stream().map((Employee e) -> e.getName()).forEach(System.out::println);

		employeeList.stream().filter((Employee e) -> nameList.contains(e.getName())).forEach(System.out::println);

	}
}
