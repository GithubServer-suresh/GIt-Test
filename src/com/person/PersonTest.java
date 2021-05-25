package com.person;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class PersonTest {

	public static void main(String[] args) {
		Comparator c;
		Person p1 = new Person("abc",20);
		Person p2 = new Person("bdc",23);
		Map<Person,Integer> map = new HashMap<>();
		map.put(p1, 7);map.put(p2, 4);
		Collection<Integer> values = map.values();
		//System.out.println(values.stream().mapToInt(Integer::intValue).sorted());
		IntStream it;
		Set s;
		List<Integer> list = new ArrayList<>();
		list.add(3);list.add(13);list.add(26);list.add(70);list.add(24);
		Long counting = list.stream().collect(Collectors.counting());
		System.out.println(counting);
		Integer reduce = list.stream().reduce(0, (a,b)->a+b);
		//System.out.println(reduce);
		
	}



}
