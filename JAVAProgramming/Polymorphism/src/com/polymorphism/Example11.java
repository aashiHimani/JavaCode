package com.polymorphism;

abstract class Vehicles{
	public abstract void startEngine();
	public abstract void stopEngine();
}
class Carss extends Vehicles{
	@Override
	public void startEngine() {
		System.out.println("Car engine starts witn key..");
	}
	@Override
	public void stopEngine() {
		System.out.println("Car engine stops witn key with turn off..");
	}
}
class Motorcycle extends Vehicles{
	@Override
	public void startEngine() {
		System.out.println("Motorcycle engine starts witn kick start..");
	}
	@Override
	public void stopEngine() {
		System.out.println("Motorcycle engine stops witn ignition was turn off..");
	}
	
}
public class Example11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicles c=new Carss();
		Vehicles m=new Motorcycle();
		c.startEngine();
		c.stopEngine();
		m.startEngine();
		m.stopEngine();
	}

}
