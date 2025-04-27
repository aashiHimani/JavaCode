package com.constructor.main;

public class ConstructorChaining {
	ConstructorChaining(){
		this(2);
		System.out.println("default constructor");
	}
	ConstructorChaining(int x){
		this(2,3);
		System.out.println(x);
	}
	ConstructorChaining(int x,int y){
		System.out.println(x*y);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ConstructorChaining();
	}
}
