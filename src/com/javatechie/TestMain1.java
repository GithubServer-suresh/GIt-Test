package com.javatechie;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

public class TestMain1 {

	public static void main(String[] args) {
		/*Objects s;
		Hashtable ht;
		Employee e1 = new Employee(109, "Steve", "A", 60000);
		Employee e2 = new Employee(109, "Steve", "A", 60000);
		System.out.println(e1.hashCode() + " " + e2.hashCode());*/
		
		Map<Integer, Character> map = new HashMap<>();
		map.put(1, 'C');map.put(4, 'D');map.put(2, 'A');
		
		
		String mapAsString = map.keySet().stream()
			      .map(key -> key + "=" + map.get(key))
			      .collect(Collectors.joining(", ", "{", "}"));
		System.out.println(mapAsString);
		
		/*Map<Integer, Employee> map = new HashMap<>();
		List<Employee> allEmployees = EmployeeDatabase.getAllEmployees(); 
		for(Employee employee : allEmployees) {
			System.out.println("1. " + employee.hashCode());
			if(map.containsKey(employee.getId())) {
				map.put(employee.getId(), employee);
			} else {
				map.put(employee.getId(), employee);
			}
		}
		
		for(Map.Entry<Integer, Employee> entry : map.entrySet()) {
			System.out.println(entry);
		} */
		
	}
}
