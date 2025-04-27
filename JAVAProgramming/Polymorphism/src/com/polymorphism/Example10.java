package com.polymorphism;

class Animalss{
	public void eat() {
		System.out.println("Animal eat...");
	}
	public void sound() {
		System.out.println("Animal sound...");
	}
}
class Lion extends Animalss{
	public void eat() {
		System.out.println("Lion eat meat...");
	}
	public void sound() {
		System.out.println("Lion sound roars...");
	}
}
class Tiger extends Animalss{
	public void eat() {
		System.out.println("Lion eat meat and other animal...");
	}
	public void sound() {
		System.out.println("Lion sound growls...");
	}
}
class Panthers extends Animalss{
	public void eat() {
		System.out.println("Panthers eat mammals...");
	}
	public void sound() {
		System.out.println("Panthers sound purr...");
	}
}
public class Example10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lion l=new Lion();
		Tiger t=new Tiger();
		Panthers p=new Panthers();
		l.eat();
		l.sound();
		t.eat();
		t.sound();
		p.eat();
		p.sound();
	}

}
