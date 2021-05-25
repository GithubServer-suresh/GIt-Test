package com.main;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;

public class TestMain {

	public static  void main(String[] args) {

		Comparator c;
		Comparable c1;
		Collection<Integer> list = new ArrayList<>();
		list.add(12);list.add(20);list.add(31);
		list.add(null);
		Iterator<Integer> it = list.iterator();
		while(it.hasNext()) {
			Integer next = it.next();
			it.remove();
			System.out.println(next);
		}
	
	}

}
