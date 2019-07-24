package com.qa.inface;

public class Testinterface implements A, B, C, D {

	public static void main(String[] args) {

		Testinterface in = new Testinterface();
		in.show();

	}

	@Override
	public void show() {
		System.out.println("Main");
	}
}