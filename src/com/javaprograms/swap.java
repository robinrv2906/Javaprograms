package com.javaprograms;

import java.util.Scanner;

public class swap {
	public static void main(String[] args) {
		int a, b, c;
		Scanner sw = new Scanner(System.in);
		System.out.println("Enter the numbers are");
		a = sw.nextInt();
		b = sw.nextInt();
		c = a;
		a = b;
		b = c;
		System.out.println("swapping numbers are");
		System.out.println(a);
		System.out.println(b);

	}
}
