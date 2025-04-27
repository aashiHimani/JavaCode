package com.oops;

class TrafficLight{
	private String colour;
	private int duration;
	public TrafficLight(String colour, int duration) {
		super();
		this.colour = colour;
		this.duration = duration;
	}
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	public void changeColor(String newColor) {
		colour=newColor;
	}
	public boolean isRed() {
		return colour.equals("red");
	}
	public boolean isGreen() {
		return colour.equals("green");
	}
}
public class Example8 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TrafficLight t=new TrafficLight("red", 30);
		System.out.println("The light is red : "+t.isRed());
		System.out.println("The light is green : "+t.isGreen());
		
		t.changeColor("green");
		System.out.println("The light is green now : "+t.isGreen());
		System.out.println("The light duration is : "+t.getDuration());
		t.setDuration(20);
		System.out.println("The light duration is : "+t.getDuration());
		
	}
}
