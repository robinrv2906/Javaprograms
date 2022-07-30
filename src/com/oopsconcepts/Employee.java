package com.oopsconcepts;

public class Employee {
	public Employee() {
		System.out.println("cts employee");	
		}
			
			public Employee(String name) {
				System.out.println("employee name "+ name);	
				}
			public static void main(String[] args) {
				Employee c=new Employee();
				Employee c1=new Employee("prabu");
			}
}
