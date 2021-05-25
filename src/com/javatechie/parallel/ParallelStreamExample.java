package com.javatechie.parallel;

import java.util.List;

import com.javatechie.Employee;
import com.javatechie.EmployeeDatabase;

public class ParallelStreamExample {

	public static void main(String[] args) {
		
		List<Employee> employees = EmployeeDatabase.getAllEmployees();
		//we will find average using normal stream and using parallel stream.Then we can find actual time diff b/w these 2.
		
		long start=0;
		long end=0;
		
		//using normal stream 
		start=System.currentTimeMillis();
		double salaryWithStream = employees.stream().map(Employee::getSalary).mapToDouble(i->i).average().getAsDouble();
		end=System.currentTimeMillis();
		System.out.println("Normal stream execution time "+ (end-start) + " Average Salary : "+ salaryWithStream);
		
		//we can create parallel stream in 2 ways. 
		// 1.using parallel()  2.using .parallelStream()
		start=System.currentTimeMillis();
		double salaryWithParallelStream = employees.parallelStream().map(Employee::getSalary).mapToDouble(i->i).average().getAsDouble();
		end=System.currentTimeMillis();
		System.out.println("Parallel stream execution time "+ (end-start) + " Average Salary : "+salaryWithParallelStream);
		
		
	}

}
