package com.person;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.IntStream;

public class Largest {

	public static void main(String[] args) {
		IntStream inStream = IntStream.of(2,9,7,6);
		int asInt = inStream.max().getAsInt();
		//System.out.println(asInt);
		
		List<Integer> list = new ArrayList<>();
		list.add(4);list.add(-1);list.add(8);list.add(10);
		Optional<Integer> max = list.stream().max(Comparator.naturalOrder());
		System.out.println(max.get());
		
	}

}
