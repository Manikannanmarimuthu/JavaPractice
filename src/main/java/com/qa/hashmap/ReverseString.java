package com.qa.hashmap;

public class ReverseString {

	public static void main(String[] args) {
		String s = "Manikannan";
		int len = s.length();
		String rev = "";
		for (int i = (len - 1); i >= 0; --i) {
			rev = rev + s.charAt(i);
		}
		System.out.println(rev);
		StringBuffer sf = new StringBuffer(s);
		System.out.println(sf.reverse());
		StringBuilder sb = new StringBuilder(s);
		System.out.println(sb.reverse());
	}

}