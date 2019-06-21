package com.qa.hashmap;

import java.util.HashMap;
import java.util.Map;

public class UsingHashMapDuplicateArray {

	public static void main(String[] args) {

		String[] name = { "A", "B", "C", "D", "E", "F", "D", "C" };

		Map<String, Integer> hashMap = new HashMap<String, Integer>();

		for (String string : name) {
			Integer count = hashMap.get(string);
			if (count == null) {
				hashMap.put(string, 1);
			} else {
				hashMap.put(string, ++count);
			}

		}
		for (Map.Entry m : hashMap.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}

	}
}