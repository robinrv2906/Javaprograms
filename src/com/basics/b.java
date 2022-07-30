package com.basics;

public class b {
	public static void main(String[] args) {
		String s="welcome to greens technology";
		
		String[] split = s.split(" ");
		
		for (String string : split) {
			String s1 = string.substring(0, 1);
			String firstletter = s1.toUpperCase();
			String remainingletter = string.substring(1, string.length());
			String word=firstletter+remainingletter;
			System.out.print(word+" ");
		} 
	}
}
