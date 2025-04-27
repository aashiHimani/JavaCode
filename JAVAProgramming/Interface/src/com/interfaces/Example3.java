package com.interfaces;

interface Flyable{
	public void fly_obj();
}
class Spacecraft implements Flyable{
	@Override
	public void fly_obj() {
		System.out.println("Aircraft is flying...");
	}
}
class Airplane implements Flyable{
	@Override
	public void fly_obj() {
		System.out.println("Airplane is flying...");
	}
}
class Helicopter implements Flyable{
	@Override
	public void fly_obj() {
		System.out.println("Helicopter is flying...");
	}
}
public class Example3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Flyable[] f= {new Spacecraft(),new Airplane(),new Helicopter()};
		for(Flyable ff:f) {
			ff.fly_obj();
		}
	}

}
