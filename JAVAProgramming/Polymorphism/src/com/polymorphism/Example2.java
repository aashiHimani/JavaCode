package com.polymorphism;

class Vehicle{
	private int speed;
	public void speedUp() {
		speed+=10;
	}
	public int getSpeed() {
		return speed;
	}
}
class Cars extends Vehicle{
	public void speedUp() {
		super.speedUp();
		System.out.println("cars speed is increased by 22 unit");
	}
}
class Bicycle extends Vehicle{
	public void speedUp() {
		super.speedUp();
		System.out.println("bicycle speed is increased by 32 unit");
	}
}
public class Example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cars c=new Cars();
		Bicycle b=new Bicycle();
		System.out.println("car initial speed: "+c.getSpeed());
		System.out.println("bicycle initial speed: "+b.getSpeed());
		c.speedUp();
		b.speedUp();
		System.out.println("car after speeding up: "+c.getSpeed());
		System.out.println("bicycle after speeding up: "+b.getSpeed());

	}

}
