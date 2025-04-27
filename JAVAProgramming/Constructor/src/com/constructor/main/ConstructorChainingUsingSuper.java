package com.constructor.main;

class Base{
	String name;
	Base(){
		this("");
		System.out.println("no argument constructor of base class");
	}
	Base(String name){
		this.name=name;
		System.out.println("parametrized constructor of base class");
	}
}
public class ConstructorChainingUsingSuper extends Base{
	ConstructorChainingUsingSuper(){
		System.out.println("no argument constructor of derived class");
	}
	ConstructorChainingUsingSuper(String name){
		super(name);
		System.out.println("parametrized constructor of derived class");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructorChainingUsingSuper obj=new ConstructorChainingUsingSuper("himu");
	}

}
