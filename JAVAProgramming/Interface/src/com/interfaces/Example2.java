package com.interfaces;

interface Animal{
	public void bark();
}
class Dog implements Animal{
	@Override
	public void bark() {
		System.out.println("Dog is barking...");
	}
}
public class Example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal d=new Dog();
		d.bark();
	}

}
