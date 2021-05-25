package com.grouping;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class AverageSalary {

	public static void main(String[] args) {
		Employee e1 = new Employee(23, "Hi", 34, "HR1");
		Employee e4 = new Employee(24, "Suri", 43, "HR");
		Employee e5 = new Employee(63, "Mick", 89, "Lead");
		Employee e2 = new Employee(12, "bac", 76, "Accounts1");
		Employee e3 = new Employee(29, "rock", 21, "Accounts");
		List<Employee> list = new ArrayList<>();
		list.add(e1);list.add(e2);list.add(e3);
		list.add(e4);list.add(e5);

		List<String> listNames = new ArrayList<>();
		for(Employee employee : list ) {
			listNames.add(employee.getEmpName());
		}
		for(String name: listNames) {
			System.out.println(name);
		}
		
		List<String> collect = list.stream().map(Employee::getEmpName).collect(Collectors.toList());
		
		
		
		Comparator<Employee> comparing = Comparator.comparing(Employee::getAge);
		Collections.sort(list, comparing);
		//System.out.println(list);
		
		
		//list.stream().collect(Collectors.groupingBy(Employee::getDept)).forEach((k,v)->System.out.println(k +" "+v));
		//Double collect = list.stream().map(Employee::getSalary).collect(Collectors.averagingInt(Integer::intValue));
		//System.out.println(collect);
		
		//list.stream().collect(Collectors.toMap(Employee::getDept, Employee::getSalary)).forEach((k,v)->System.out.println(k+" "+v));
		
		Map<Integer,Employee> map = new HashMap<>();
		map.put(3, e1);map.put(1, e2);
		//map.values().forEach(System.out::println);
		
		
	}
}
