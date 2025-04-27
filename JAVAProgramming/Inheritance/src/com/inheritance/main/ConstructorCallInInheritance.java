package com.inheritance.main;

class Base{
	Base(){
		System.out.println("base class");
	}
}
class Derived extends Base{
	Derived(){
		System.out.println("derived class");
	}
}
public class ConstructorCallInInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Derived d=new Derived();
	}

}
