package com.oopsconcepts;

public class customer extends BankDetails {
	@Override
	public void customerName(String a) {
		super.customerName(a);
	}
	@Override
		public void customerFathername(String a) {
			super.customerFathername(a);
		}
	@Override
		public void customerAcc(int a) {
			super.customerAcc(a);
		}
	public static void main(String[] args) {
		customer cus=new customer();
		cus.customerName("Rohan");
		cus.customerFathername("Krishna");
		cus.customerAcc(42332533);
	}
}
