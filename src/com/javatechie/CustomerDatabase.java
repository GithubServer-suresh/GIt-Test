package com.javatechie;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CustomerDatabase {
	public static List<Customer> getAll() {
		return Stream.of(
				new Customer(101, "John", "John@gmail.com", Arrays.asList("1234", "5678")),
				new Customer(102, "Stephen", "Step@gmail.com", Arrays.asList("3421", "7842")),
				new Customer(101, "Smith", "Smith@gmail.com", Arrays.asList("9001", "3721")),
				new Customer(101, "Parker", "Parker@gmail.com", Arrays.asList("5210", "5612"))
				).collect(Collectors.toList());		
	}
}
