package com.grouping;

import java.util.ArrayList;
import java.util.List;

public class SumOfSquares {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(2);list.add(3);list.add(4);
		list.stream().filter(value->value%2!=0).map(value->value*value).forEach(System.out::println);
	}
}
