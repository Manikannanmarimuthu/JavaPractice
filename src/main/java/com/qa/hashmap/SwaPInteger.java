package com.qa.hashmap;

public class SwaPInteger {

	public static void main(String[] args) {
		int a = 2;
		int b = 3;
		int t = 0;

		// With 3rd Variable swap
		/*
		 * t = a; a = b; b = t; System.out.println(a + " " + b);
		 */

		
		//Methopd 1
		/*
		 * a = a + b; b = a - b; a = a - b; System.out.println("Without 3rd Variable" +
		 * a + " " + b);
		 */

		//Methopd 2
		/*
		 * a = a * b; b = a / b; a = a / b; System.out.println("Without 3rd Variable : "
		 * + a + " " + b);
		 */
		//Methopd 3 XOR Operator
		a = a ^ b;
		b = a ^ b;
		a = a ^ b;
		System.out.println("Without 3rd Variable : " + a + " " + b);
	}

}
