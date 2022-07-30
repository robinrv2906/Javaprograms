package com.oopsconcepts;

public class Interface_Child implements Interface_1, Interface_2{
	@Override
	public void person3() {
		System.out.println("IPHONE");
	}

	@Override
	public void person4() {
		System.out.println("samsung s20");
	}

	@Override
	public void person1() {
		System.out.println("Redmi");
	}

	@Override
	public void person2() {
		System.out.println("oneplus");
	}

	public static void main(String[] args) {
		Interface_Child in = new Interface_Child();
		in.person1();
		in.person2();
		in.person3();
		in.person4();
	}
}
