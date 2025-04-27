package com.inheritance;

class Animal{
	void makeSound() {
		System.out.println("Animal sound..");
	}
}

class Cat extends Animal{
	void makeSound() {
		System.out.println("Meow sound..");
	}
}

public class Example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cat obj=new Cat();
		obj.makeSound();
		Animal obj1=new Animal();
		obj1.makeSound();
	}

}
