package com.polymorphism;

class Shape{
	public double calculateArea() {
		return 0.0;
	}
}
class Circle extends Shape{
	private double radius;
	public Circle(double radius) {
		super();
		this.radius = radius;
	}
	public double calculateArea() {
		return Math.PI*radius*radius;
	}
}
class Rectangle extends Shape{
	private double length;
	private double width;
	public Rectangle(double length, double width) {
		super();
		this.length = length;
		this.width = width;
	}
	public double calculateArea() {
		return length*width;
	}
}
class Triangle extends Shape{
		private double side1;
		private double side2;
		private double side3;
		public Triangle(double side1, double side2, double side3) {
			super();
			this.side1 = side1;
			this.side2 = side2;
			this.side3 = side3;
		}
		public double calculateArea() {
			double s=(side1+side2+side3)/2;
			return Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
		}
}
public class Example3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle c=new Circle(2.0);
		Rectangle r=new Rectangle(4.0,3.0);
		Triangle t=new Triangle(8.0,7.0,6.0);
		System.out.println("Area of circle is: "+c.calculateArea());
		System.out.println("Area of rectangle is: "+r.calculateArea());
		System.out.println("area of trianle is: "+t.calculateArea());
	}

}
