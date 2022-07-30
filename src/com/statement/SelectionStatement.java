package com.statement;

public class SelectionStatement {
	public static void main(String[] args) {
		int i=18;
		if (i>21) {
			System.out.println("eligible for vote and candidate");
			
		}
		else if (i>18) {
			System.out.println("eligible for vote");
			
		}
		else {
			System.out.println("not eligible for vote");
		}
	}
}
