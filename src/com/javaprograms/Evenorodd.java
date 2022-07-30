package com.javaprograms;

import java.util.Scanner;

public class Evenorodd {
	public static void main(String[] args) {
		Scanner e = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = e.nextInt();
		if (n % 2 == 0) {
			System.out.println("Even number");

		} else {
			System.out.println("odd number");
		}
	}
}
