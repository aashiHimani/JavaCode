package com.polymorphism;

class Animal{
	public void sound() {
		System.out.println("Animal sound...");
	}
}
class Bird extends Animal{
	public void sound() {
		System.out.println("Bird chirrping...");
	}
}
class Cat extends Animal{
	public void sound() {
		System.out.println("Cat meow...");
	}
}
public class Example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal a=new Animal();
		a.sound();
		Bird b=new Bird();
		b.sound();
		Cat c=new Cat();
		c.sound();
	}

}
