package com.statement;
//exception handling --->try catch finally

public class Excep {
	public static void main(String[] args) {
		System.out.println("start");
		System.out.println(1);
		System.out.println(2);
		System.out.println(3);
		System.out.println(4);
		try {
			System.out.println(10/0);
		} catch (ArithmeticException e) {
			System.out.println("not possible 10/0");
		}finally {
			System.out.println("Not Good");
		}
		System.out.println(6);

	}
}
