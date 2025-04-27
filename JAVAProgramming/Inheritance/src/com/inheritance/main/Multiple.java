package com.inheritance.main;

class Person{
	void show() {
		System.out.println("person...");
	}
}
class Human{
	void show() {
		System.out.println("working...");
	}
}

public class Multiple extends Human,Person{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Multiple m=new Multiple();
		m.show();
	}

}
