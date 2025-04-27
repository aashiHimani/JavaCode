package com.inheritance;

abstract class Vehicles{
	private String make;
	private String model;
	private int year;
	private String fuelType;
	private double fuelEfficiency;
	public Vehicles(String make, String model, int year, String fuelType, double fuelEfficiency) {
		super();
		this.make = make;
		this.model = model;
		this.year = year;
		this.fuelType = fuelType;
		this.fuelEfficiency = fuelEfficiency;
	}
	public String getMake() {
		return make;
	}
	public String getModel() {
		return model;
	}
	public int getYear() {
		return year;
	}
	public String getFuelType() {
		return fuelType;
	}
	public double getFuelEfficiency() {
		return fuelEfficiency;
	}
	public abstract double calculateFuelEfficiency();
	public abstract double calculateDistanceTraveled();
	public abstract double calculateMaximumSpeed();
}
class Truck extends Vehicles{
	private double capacity;
	public Truck(String make, String model, int year, String fuelType, double fuelEfficiency,double capacity) {
		super(make, model, year, fuelType, fuelEfficiency);
		this.capacity=capacity;
		// TODO Auto-generated constructor stub
	}
	

	public double getCapacity() {
		return capacity;
	}

	@Override
	public double calculateFuelEfficiency() {
		// TODO Auto-generated method stub
		return getFuelEfficiency()*(1.0/(1.0+(getCapacity()/1000.0)));
	}

	@Override
	public double calculateDistanceTraveled() {
		// TODO Auto-generated method stub
		return calculateFuelEfficiency()*getFuelEfficiency();
	}

	@Override
	public double calculateMaximumSpeed() {
		// TODO Auto-generated method stub
		return 80.0;
	}
	
}
class  Car1 extends Vehicles{
	private int seats;
	public Car1(String make, String model, int year, String fuelType, double fuelEfficiency,int seats) {
		super(make, model, year, fuelType, fuelEfficiency);
		this.seats=seats;
		// TODO Auto-generated constructor stub
	}
	public int getSeats() {
		return seats;
	}
	@Override
	public double calculateFuelEfficiency() {
		// TODO Auto-generated method stub
		return getFuelEfficiency()*(1.0/(1.0+(getSeats()/1000.0)));
	}

	@Override
	public double calculateDistanceTraveled() {
		// TODO Auto-generated method stub
		return calculateFuelEfficiency()*getFuelEfficiency();
	}

	@Override
	public double calculateMaximumSpeed() {
		// TODO Auto-generated method stub
		return 120.0;
	}
	
}
class Motorcycle extends Vehicles{
	private double engine;
	public Motorcycle(String make, String model, int year, String fuelType, double fuelEfficiency,double engine) {
		super(make, model, year, fuelType, fuelEfficiency);
		this.engine=engine;
		// TODO Auto-generated constructor stub
	}
	public double getEngine() {
		return engine;
	}
	@Override
	public double calculateFuelEfficiency() {
		// TODO Auto-generated method stub
		return getFuelEfficiency()*(1.0/(1.0+(getEngine()/1000.0)));
	}

	@Override
	public double calculateDistanceTraveled() {
		// TODO Auto-generated method stub
		return calculateFuelEfficiency()*getFuelEfficiency();
	}

	@Override
	public double calculateMaximumSpeed() {
		// TODO Auto-generated method stub
		return 150.0;
	}
	
}
public class Example9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Truck t=new Truck("Tata","Tata 15A",2020,"Gasoline",8.1,4.5);
		Car1 c=new Car1("Mahindra","SUV 6",2021,"Petrol",9.0,6);
		Motorcycle m=new Motorcycle("Yamaha","R15",2018,"Petrol",2.1,3.0);
		System.out.println("Truck model: "+t.getModel());
		System.out.println("Truck fuel efficiency: "+t.calculateFuelEfficiency()+" mpg");
		System.out.println("Truck distance traveled: "+t.calculateDistanceTraveled()+" miles");
		System.out.println("Truck maximum speed: "+t.calculateMaximumSpeed()+" mph\n");
		
		System.out.println("Car model: "+c.getModel());
		System.out.println("Car fuel efficiency: "+c.calculateFuelEfficiency()+" mpg");
		System.out.println("Car distance traveled: "+c.calculateDistanceTraveled()+" miles");
		System.out.println("Car maximum speed: "+c.calculateMaximumSpeed()+" mph\n");
		
		System.out.println("Motorcycle model: "+m.getModel());
		System.out.println("Motorcycle fuel efficiency: "+m.calculateFuelEfficiency()+" mpg");
		System.out.println("Motorcycle distance traveled: "+m.calculateDistanceTraveled()+" miles");
		System.out.println("Motorcycle maximum speed: "+m.calculateMaximumSpeed()+" mph");
	}

}
