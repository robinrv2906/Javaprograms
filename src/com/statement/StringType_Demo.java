package com.statement;

public class StringType_Demo {
	public static void main(String[] args) {
		System.out.println("***********immute***********");
		String s = "sandhiya";
		String s1 = "sandhiya";
		System.out.println(s);
		System.out.println(s1);
		System.out.println(System.identityHashCode(s));
		System.out.println(System.identityHashCode(s1));
		String r = s.concat(s1);
		System.out.println(r);
		System.out.println(System.identityHashCode(r ));
		
		System.out.println("***********mute***********");
		StringBuffer s2 =new StringBuffer ("sandhiya");
		StringBuffer s3 =new StringBuffer("sandhiya");
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(System.identityHashCode(s2));
		System.out.println(System.identityHashCode(s3));
		s2.append(s3);
		System.out.println(s2);
		System.out.println(System.identityHashCode(s2 ));
	}

}
