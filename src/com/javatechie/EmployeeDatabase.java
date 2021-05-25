package com.javatechie;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EmployeeDatabase {

	
	public static List<Employee> getAllEmployees() {
		return Stream.of(
	new Employee(109, "Steve", "A", 60000),
	new Employee(109, "Steve", "A", 60000),
	new Employee(101, "Jack", "B", 80000)
	/*new Employee(109, "Kim", "A", 90000),
	new Employee(109, "Smith", "C", 15000)*/
				).collect(Collectors.toList());
		/*List<Employee> employees = new ArrayList<>();
		for(int i=1; i<=1000; i++) {
			employees.add(new Employee(i, "employee"+i, "A", Double.valueOf(new Random().nextInt(1000*100))));
		}
		return employees;*/
	}
}
