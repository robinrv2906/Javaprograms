package com.statement;

import java.util.Scanner;

public class SwitchStatement {
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<=5; i++) {
			System.out.println("enter the details");
			int college = sc.nextInt();
			switch (college) {
			case 1:
				System.out.println("BCA");
				break;
			case 2:
				System.out.println("BA");
				break;
			case 3:
				System.out.println("B.COM");
				break;
			case 4:
				System.out.println("BE");
				break;
			case 5:
				System.out.println("BSC");

			default:
				System.out.println("Not in the department");
				break;
			}
			
		}
		}
}
