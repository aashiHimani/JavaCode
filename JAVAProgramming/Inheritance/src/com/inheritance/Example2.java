package com.inheritance;

class Vehicle{
	void drive() {
		System.out.println("Repairing a vehicle...");
	}
}
class Car extends Vehicle{
	void drive() {
		System.out.println("Repairing a car..");
	}
			
}
public class Example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car obj=new Car();
		obj.drive();
		Vehicle obj1=new Vehicle();
		obj1.drive();
	}

}
