package com.oops;

import java.time.LocalTime;

class Airplane{
	private String flightNumber;
	private String destination;
	private LocalTime scheduleDeparture;
	private int delayTime;
	public Airplane(String flightNumber, String destination, LocalTime scheduleDeparture) {
		super();
		this.flightNumber = flightNumber;
		this.destination = destination;
		this.scheduleDeparture = scheduleDeparture;
		this.delayTime = 0;
	}
	public String getFlightNumber() {
		return flightNumber;
	}
	public void setFlightNumber(String flightNumber) {
		this.flightNumber = flightNumber;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public LocalTime getScheduleDeparture() {
		return scheduleDeparture;
	}
	public void setScheduleDeparture(LocalTime scheduleDeparture) {
		this.scheduleDeparture = scheduleDeparture;
	}
	public int getDelayTime() {
		return delayTime;
	}
	public void delay(int minute) {
		this.delayTime=minute;
		this.scheduleDeparture=this.scheduleDeparture.plusMinutes(minute);
	}
	public void checkStatus(){
		if(delayTime==0) {
			System.out.println("Flight "+flightNumber+" is on time..");
		}
		else {
			System.out.println("Flight "+flightNumber+" is delayed by "+delayTime+" minutes "+"\n");
		}
	}
}
public class Example12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Airplane a=new Airplane("CDE345", "London", LocalTime.of(10, 30));
		Airplane a1=new Airplane("HUI899", "Paris", LocalTime.of(15, 0));
		Airplane a2=new Airplane("DRE365", "Switzerland", LocalTime.of(12, 17));
		System.out.println("Flight status is:");
		a.checkStatus();
		a1.checkStatus();
		a2.checkStatus();
		a.delay(20);
		a1.delay(50);
		a2.delay(90);
		System.out.println("after delaying Flight status is:");
		a.checkStatus();
		a1.checkStatus();
		a2.checkStatus();
	}

}
