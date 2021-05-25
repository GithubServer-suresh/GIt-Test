package com.javatechie;

import java.util.Arrays;
import java.util.List;

public class OptionalDemo {

	public static void main(String[] args)  throws Exception{


		Customer customer = new Customer(101, "john", "test@gmail.com" , Arrays.asList("39797922",  "983422"));
		//Optional<String> emailOptional2 = Optional.ofNullable(customer.getEmail());
		//System.out.println(emailOptional2.orElse("default email..."));
		//orElse and orElseGet both are similar. 1 is taking Supplier and other is having default return type. 
		//System.out.println(emailOptional2.map(String::toUpperCase).orElseGet(()->"default email..."));

		getCustomerByEmail("pqr"); //NosuchElementException
		
	}
	public static Customer getCustomerByEmail(String email)  throws Exception{
		List<Customer> customers = CustomerDatabase.getAll();
		//based on input email id, we have to find single customer
		//instead of returning get() directly which returns NoSuchElementException 
/*		return customers.stream()
		.filter(customer->customer.getEmail().equals(email))
		.findAny().get();
*/		
		return customers.stream()
				.filter(customer->customer.getEmail().equals(email))
				.findAny().orElseThrow(()->new Exception("No Customer present with this email id"));
		
	}
}
