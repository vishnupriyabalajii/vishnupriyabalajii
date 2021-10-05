package com.Collection.org;

import java.util.HashSet;
import java.util.Set;

public class Collection_Array_list {
	public static void main(String[] args) {
		System.out.println("Set Function ");
		Set<Object> se = new HashSet<Object>();
		se.add(10);
		se.add("vishnu");
		se.add(20);
		se.add("priya");
		se.add(30);
		se.add("rathi");
		se.add(40);
		se.add("priya");
		System.out.println("Using add function:" + se);
		int size = se.size();
		System.out.println("Size of:" + size);
		boolean contains = se.contains("vishnu");
		System.out.println("contains of:" + contains);
		se.clear();
		System.out.println("clear the set values:" + se);
		se.add(10);
		se.add("vishnu");
		se.add(20);
		se.add("priya");
		se.add(30);
		se.add("rathi");
		se.add(40);
		se.add("priya");
		System.out.println("After MOdification:" + se);
		Set<Object> se1 = new HashSet<Object>();
		se1.add("selvi");
		se1.add(50);
		se1.add("mohana");
		se1.add(60);
		se1.add("dinesh");
		se1.add(70);
		System.out.println("Using new variables :" + se1);
		se.addAll(se1);
		System.out.println("using Addall Funtion:" + se);
		se.retainAll(se1);
		System.out.println("retain the Values:" + se);
		se.removeAll(se1);
		System.out.println("removeall values in set function:" + se);
		boolean empty = se.isEmpty();
		System.out.println("set is empty or not:" + empty);
		boolean equals = se.equals(se1);
		System.out.println("is equal:" + equals);

	}

}
