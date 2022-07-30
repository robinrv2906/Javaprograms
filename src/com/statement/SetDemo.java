package com.statement;

import java.util.Set;
import java.util.TreeSet;

public class SetDemo {
	public static void main(String[] args) {

		Set<Integer> s = new TreeSet <Integer>();
		s.add(8000);
		s.add(400);
		s.add(40);
		System.out.println(s);
		int s1=s.size();
		System.out.println(s1);
		s.remove(10);
		System.out.println(s);
		s.getClass();
		System.out.println(s);
		s.retainAll(s);
		System.out.println(s);
		s.removeAll(s);
		System.out.println(s);
		s.add(6000);
		System.out.println(s);
		
	}

}
