package com.javabasics;

public class DowhileLoop_Demo {
	public static void main(String[] args) {
		int i=1;
		do {
			System.out.print(i);
			++i;
		}while (i<=5);
		System.out.println("outer the loop value is: "+i);
	}
}
