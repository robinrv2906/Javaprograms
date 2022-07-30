package com.oopsconcepts;

public class Method_Overloading {
	public void studentDetails() {
		System.out.println("MECH Student");
	}
	public void studentDetails(int a) {
		System.out.println(a);
	}
	public void studentDetails(String name,String Dept,int Reg ) {
		System.out.println(name+" "+Dept+" "+Reg);
	}
	public void studentDetails(int a,int b,int c) {
		System.out.println(a+" "+b+" "+c);
	}
	public static void main(String[] args) {
		Method_Overloading n=new Method_Overloading();
		n.studentDetails();
		n.studentDetails(5);
		n.studentDetails("prabu", "MECH", 420716114);
		n.studentDetails(10, 20, 30);
		
	}
}
