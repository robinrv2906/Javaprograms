package com.statement;

public class ArrayDemo {

	public static void main(String[] args) {
		int a[] = new int[6];
		a[1]=10;
		a[2]=20;
		a[3]=30;
		a[4]=40;
		a[0]=50;
		System.out.println(a[3]);
		a[3]=300;
		System.out.println(a[3]);
		for (int i : a) {
			System.out.println(i);
		}
		System.out.println(a[5]);
	}
}
