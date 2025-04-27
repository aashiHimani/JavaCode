package com.exceptionhandling.methodoverriding;

import java.io.IOException;

/*
 * If the superclass method does not declare an exception, 
 * subclass overridden method cannot declare the checked exception but it can declare unchecked exception.
 */

class Parent{
	void show() {
		System.out.println("welcome...");
	}
}
public class SuperClassNotDeclareException extends Parent{
	void show() throws IOException {
		System.out.println("subclass");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent p=new SuperClassNotDeclareException();
		p.show();
	}

}
