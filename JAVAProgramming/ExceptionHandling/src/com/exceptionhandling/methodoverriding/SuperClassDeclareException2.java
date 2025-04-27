package com.exceptionhandling.methodoverriding;

//subclass overridden method declares subclass exception
class Parentb{
	void show() throws Exception{
		System.out.println("parent method");
	}
}
public class SuperClassDeclareException2 extends Parentb{
	void show() throws ArithmeticException{
		System.out.println("child method");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parentb p=new SuperClassDeclareException2();
		try {
			p.show();
		}
		catch(Exception e) {
			e.getMessage();
		}
	}

}
