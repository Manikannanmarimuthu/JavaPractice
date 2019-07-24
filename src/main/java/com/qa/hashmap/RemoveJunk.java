package com.qa.hashmap;

public class RemoveJunk {

	public static void main(String[] args) {
		String s = "ak8273648723847$%%$%$%$%^%^ Mani &^%^%^";
		s = s.replaceAll("[^A-Z]", "");
		System.out.println(s);
	}
}
