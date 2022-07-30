package com.statement;

public class String_Fun {

	public static void main(String[] args) {// string functions or string manipulation or string methods//
		String s = "Hello-Welcome-To-Java-World";
		
		System.out.println(s.length());
		
		boolean equ=s.equals("Hello-Welcome-To-Java-World");
		System.out.println(equ);
		
		boolean equ1=s.equalsIgnoreCase("hello-welcome-to-Java-world");
		System.out.println(equ1);
		
		boolean cont=s.contains("Hello");
		System.out.println(cont);
		
		String split1[]=s.split("-");
		for (int i = 0; i < split1.length; i++) {
			System.out.println(split1[i]);
		}
		
		String upper=s.toUpperCase();
		System.out.println(upper);
		
		String lower=s.toLowerCase();
		System.out.println(lower);
		
		String sub=s.substring(6);
		System.out.println(sub);
		
		boolean empty = s.isEmpty();
		System.out.println(empty);
		
		System.out.println(System.identityHashCode(s));
		
		boolean start=s.startsWith("Hello");
		System.out.println(start);
		
		boolean end=s.endsWith("World");
		System.out.println(end);
		
		int comp=s.compareTo("Hello");
		System.out.println(comp);
		
		int charc=s.charAt(5);
		System.out.println(charc);
		
		int ind=s.indexOf("o");
		System.out.println(ind);
		
		int last =s.lastIndexOf("d");
		System.out.println(last);
		
		String rep=s.replace("Hello", "Hi");
		System.out.println(rep);
		
		String s1 = "       Hello Welcome To Java    ";       //remove unwanted space starting and ending//
		System.out.println("length of the string before trim "+s1.length());
		
		String trm=s1.trim();
		System.out.println(trm);
		System.out.println("lengthof the string after trim "+trm.length());
		
		String r=s.concat(s1);
		System.out.println(r);
		
				
	
	}  
}
