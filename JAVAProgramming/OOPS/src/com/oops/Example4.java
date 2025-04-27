package com.oops;

class Circle{
	private double radius;

	public Circle(double radius) {
		super();
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	public double getArea() {
		return Math.PI*radius*radius;
	}
	public double getCircumference() {
		return 2*Math.PI*radius;
	}
}
public class Example4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle c=new Circle(5.0);
		System.out.println("area of circle is  "+ c.getArea()+" and circumference is "+c.getCircumference());
		c.setRadius(11.0);
		System.out.println("area of circle is  "+ c.getArea()+" and circumference is "+c.getCircumference());
	}

}
