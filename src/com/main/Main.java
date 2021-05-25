package com.main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;


public class Main {	
	
	public static void main(String[] args) {
		/*CopyOnWriteArrayList cl;
		Foodballer ronaldo = new Foodballer("ronaldo", 27);
		Foodballer messi = new Foodballer("messi", 34);
		Foodballer chethan = new Foodballer("chethan", 12);
		
		List<Foodballer> asList = Arrays.asList(ronaldo, messi, chethan);
		//Comparator<Foodballer> comparing = Comparator.comparing(Foodballer::getName);
		//Collections.sort(asList, comparing);
		Collections.sort(asList);
		System.out.println(asList);*/	
		Objects ob;
		
		List<String> list1 = new ArrayList<>();
		list1.add("c1");list1.add("c2");list1.add("c3");
		System.out.println(list1);
		
		List<String> list = Arrays.asList("a","b");
		list.add("c");
		System.out.println(list);
		
		
		
		
		
	}

}
