package com.javabasics;

public class Array_Demo {
	public static void main(String[] args) {
		
		int b[]= {10,20,39,252};
		int a[]=new int[5];
		a[0]=10;
		a[1]=20;
		a[2]=30;
		a[3]=40;
		a[4]=50;
		System.out.println(a[3]);
		System.out.println(b[2]);
		for (int i : b) {
			System.out.println(i);
			
		}
		
	}
}
