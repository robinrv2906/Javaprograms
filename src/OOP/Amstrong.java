package OOP;

import java.util.Scanner;

public class Amstrong {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Number");
		int n=scanner.nextInt();
		int a,i=0,j=0;
		a=n;
		while (a>0) {
			i=a%10;
			j=(i*i*i)+j;
			a=a/10;
			
		}
		if (n==j) {
			
			System.out.println("number is amstrong");
		}
		else
			System.out.println("number is not amstrong");
	}

}
