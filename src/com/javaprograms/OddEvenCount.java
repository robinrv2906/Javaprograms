package com.javaprograms;

public class OddEvenCount {
	public static void main(String[] args) {
		int evencount = 0, oddcount = 0;
		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0) {
				evencount++;
			} else {
				oddcount++;
			}
		}
		System.out.println("even count is " + evencount);
		System.out.println("odd count is " + oddcount);
	}
}
