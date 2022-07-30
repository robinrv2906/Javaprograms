package com.oopsconcepts;

import java.util.Scanner;

public class Scanner_Demo {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("enter the name");
		String name=scanner.nextLine();
		System.out.println(name);
		
		System.out.println("enter the name");
		String name1=scanner.next();
		System.out.println(name1);
		
		System.out.println("enter the number");
		int number=scanner.nextInt();
		System.out.println(number);
		
		System.out.println("enter the number");
		float number1=scanner.nextFloat();
		System.out.println(number1);
		
		System.out.println("enter the name");
		char name2=scanner.next().charAt(4);
		System.out.println(name2);
	 }
}
