package com.qa.hashmap;

public class HashMap {

	public static void main(String[] args) {

		String[] name = { "A", "B", "C", "D", "E", "F", "D", "C" };

		for (int i = 0; i < name.length; i++) {
			for (int j = i + 1; j < name.length; j++) {
				if (name[i].equals(name[j])) {
					System.out.println("Duplicate Element : " + name[i]);
				}
			}
		}
	}
}