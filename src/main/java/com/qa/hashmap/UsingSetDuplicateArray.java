package com.qa.hashmap;

import java.util.HashSet;
import java.util.Set;

public class UsingSetDuplicateArray {

	public static void main(String[] args) {
		String[] name = { "A", "B", "C", "D", "E", "F", "D", "C" };
		Set<String> storeSet = new HashSet<String>();
		for (String string : name) {
			if (storeSet.add(string) == false) {
				System.out.println("Duplicate Element : " + string);
			}
		}
	}
}