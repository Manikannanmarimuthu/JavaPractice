package com.qa.hashmap;

public class SwapString {

	public static void main(String[] args) {
		String a = "Ma";
		String b = "Kannan";
		System.out.println("Before Swap : " + "a value is " + ":" + " " + a + " b value is " + ":" + " " + b);
		a = a + b;
		System.out.println("After append A value is " + ": " + a);
		b = a.substring(0, a.length() - b.length());
		a = a.substring(b.length());
		System.out.println("After Swap : " + "a value is " + ":" + " " + a + " b value is " + ":" + " " + b);
	}
}
