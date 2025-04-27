package com.exceptionhandling.methodoverriding;

/*
 * If the superclass method declare an exception, 
 * subclass overridden method can declare same, 
 * subclass exception or no exception but cannot declare parent exception.
 */	

//subclass overridden method declares parent exception
class Parent1{
	void show() throws ArithmeticException{
		System.out.println("parent method");
	}
}

public class SuperClassDeclareException extends Parent1{
	void show() throws Exception{
		System.out.println("child method");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent1 p=new SuperClassDeclareException();
		try {
			p.show();
		}
		catch(Exception e) {
			e.getMessage();
		}
	}

}
