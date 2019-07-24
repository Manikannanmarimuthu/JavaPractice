package com.qa.hashmap;

import java.util.HashMap;
import java.util.Map;

public class CountChar {

	public static void main(String[] args) {
		String s = "AAAABBCCCDDDDZZZZZAZBBB";
		int no = s.length();
		Map<String, Integer> hm = new HashMap<String, Integer>();
		for (int i = 0; i < no; i++) {
			String ch = String.valueOf(s.charAt(i));
			Integer count = hm.get(ch);
			if (count == null) {
				hm.put(ch, 1);
			} else {
				hm.put(ch, ++count);
			}
		}
		for (Map.Entry m : hm.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}
	}
}