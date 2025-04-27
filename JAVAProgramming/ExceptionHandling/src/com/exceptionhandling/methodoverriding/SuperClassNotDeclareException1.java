package com.exceptionhandling.methodoverriding;

class Parents{
	void show() {
		System.out.println("welcome...");
	}
}
public class SuperClassNotDeclareException1 extends Parents{
	void show() throws ArithmeticException {
		System.out.println("subclass");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parents p=new SuperClassNotDeclareException1();
		p.show();
	}

}
