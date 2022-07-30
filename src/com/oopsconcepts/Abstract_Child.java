package com.oopsconcepts;

public class Abstract_Child extends Abstract_Demo{
	@Override
	public void statement() {
		System.out.println("last 6 month statement");
	}
	public static void main(String[] args) {
		Abstract_Child ch=new Abstract_Child();
		ch.homeloan();
		ch.statement();
    }
}
