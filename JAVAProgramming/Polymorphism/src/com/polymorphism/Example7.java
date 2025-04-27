package com.polymorphism;

class Animals{
	public void move() {
		System.out.println("Animal move...");
	}
	public void makeSound() {
		System.out.println("Animal make sound...");
	}
}
class Birds extends Animals{
	public void move() {
		System.out.println("Bird fly...");
	}
	public void makeSound() {
		System.out.println("Bird chirp...");
	}
}
class Panthera extends Animals{
	public void move() {
		System.out.println("Panthera walk...");
	}
	public void makeSound() {
		System.out.println("Panthera roars...");
	}
}
public class Example7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Birds b=new Birds();
		Panthera p=new Panthera();
		performAction(b);
		performAction(p);
	}
	public static void performAction(Animals animal) {
		animal.move();
		animal.makeSound();
	}
}
