package com.javatechie;

import java.util.Arrays;
import java.util.List;

public class MapReduceExample {

	public static void main(String[] args) {
		
		
		//now we do with average salary of employees
		
		//1.get employee whose grade is A
		//2.get salary of employee of having grade A -- data transformation  
		
		List<Employee> allEmployees = EmployeeDatabase.getAllEmployees();
		allEmployees.stream().map(Employee::getGrade).filter(employee->employee.equals("A")).forEach(i->System.out.println(i));
		
		double avgSalary = allEmployees.stream()
		  			.filter(employee->employee.getGrade().equalsIgnoreCase("A"))
		  			.map(employee -> employee.getSalary())
		  			.mapToDouble(i->i)
		  			.average().getAsDouble();
		System.out.println(avgSalary);
		  		
		//sum of emp having grade A
		double sumSalary = allEmployees.stream().filter(employee->employee.getGrade().equalsIgnoreCase("A")).map(Employee::getSalary).mapToDouble(sal->sal).sum();
	System.out.println(sumSalary);
		
	}

}
