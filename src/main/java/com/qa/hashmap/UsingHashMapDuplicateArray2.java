package com.qa.hashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class UsingHashMapDuplicateArray2 {

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
		Set<Entry<String, Integer>> entryset = hashMap.entrySet();
		for (Entry<String, Integer> m : entryset) {
			if (m.getValue() > 1) {
				System.out.println(m.getKey() + " " + m.getValue());
			}
		}
	}

}