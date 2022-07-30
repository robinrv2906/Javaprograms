package com.shopping;

import java.util.Scanner;

public class Customer {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("welcome \nEnter the details");
		
		System.out.println("Enter your Name");
		String name = sc.nextLine();
		System.out.println(name);

		System.out.println("Enter your Mobile Number");
		long mobile = sc.nextLong();
		System.out.println(mobile);

		sc.nextLine();

		System.out.println("Enter your Email ID");
		String email = sc.nextLine();
		System.out.println(email);
		
		System.out.println("MENU Card\n(1.Chocolate ₹100\n2.Vanilla ₹200\n3.Mint Chocolate Chip ₹300\n4.Cookie Dough ₹400\n5.Buttered Pecan ₹500\n6.Neapolitan ₹600\n7.Banana ₹700\n8.Toffee ₹800\n9.Caramel ₹900\n10.Dark Chocolate ₹1000)");

		for (int i = 0; i < 10; i++) {
			
		
			System.out.println(
					"please select your item");
			int item = sc.nextInt();
			
			switch (item) {
			case 1:
				System.out.println("Chocolate");
				break;
			case 2:
				System.out.println("Vanilla");
				break;
			case 3:
				System.out.println("Mint Chocolate Chip");
				break;
			case 4:
				System.out.println("Cookie Dough");
				break;
			case 5:
				System.out.println("Buttered Pecan");
				break;
			case 6:
				System.out.println("Neapolitan");
				break;
			case 7:
				System.out.println("Banana" );
				break;
			case 8:
				System.out.println("Toffee");
				break;
			case 9:
				System.out.println("Caramel");
				break;
			case 10:
				System.out.println("Dark Chocolate");
				break;
				
				default:
					System.out.println("selected item not in the list");
					break;
			}
			
	
		}

	}
}
