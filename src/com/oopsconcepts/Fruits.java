package com.oopsconcepts;

public class Fruits extends Vegetable{

	public void apple() {
		System.out.println("\"Apple Rate is Rs: 200\"");
	}
	public void banana() {
		System.out.println("\"Banana Rate is Rs: 150\"");
	}
	public static void main(String[] args) {
		Fruits f=new Fruits();
		f.onion();
		f.tomato();
		f.beans();
		f.cucumber();
		f.apple();
		f.banana();
	}
}
