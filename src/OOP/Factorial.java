package OOP;

import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		int factorial=1;
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the Number");
		int n=scanner.nextInt();
		
		for (int i = 1; i <=n; i++) {
			factorial=factorial*i;
		}
		
		System.out.println(factorial);
	}
}
