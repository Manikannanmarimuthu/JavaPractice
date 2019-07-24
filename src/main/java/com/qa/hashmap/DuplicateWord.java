package com.qa.hashmap;

import java.util.LinkedHashSet;
import java.util.Set;

public class DuplicateWord {

	public static void main(String[] args) {
		String s = "I am am Mani Kannan";
		String[] a = s.split(" ");
		Set<String> mset = new LinkedHashSet<String>();
		for (String string : a) {
			mset.add(string);
		}
		mset.forEach(e -> System.out.println(e));
	}
}
