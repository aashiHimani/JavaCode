package com.encapsulation;

class Circle{
	private double radius;

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	public double getArea() {
		return Math.PI*radius*radius;
	}
	public double getPerimeter() {
		return 2*Math.PI*radius;
	}
}
public class Example5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle c=new Circle();
		c.setRadius(4.0);
		System.out.println("radius of the circle: "+c.getRadius());
		System.out.println("area of the circle: "+c.getArea());
		System.out.println("perimeter of the circle: "+c.getPerimeter());
	}

}
