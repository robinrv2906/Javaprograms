package com.oopsconcepts;
/**
 * @author ELCOT
 *
 */
public class DryFruits extends Fruits{
	public void Badam() {
		System.out.println("\"Badam Rate is Rs:500\"");
	}
	public void pista() {
		System.out.println("\"pista Rate is Rs: 1000\"");
	}
	public static void main(String[] args) {
		DryFruits dr=new DryFruits();
		dr.onion();
		dr.tomato();
		dr.beans();
		dr.cucumber();
		dr.apple();
		dr.banana();
		dr.Badam();
		dr.pista();
	}
}
