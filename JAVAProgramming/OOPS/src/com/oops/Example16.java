package com.oops;

abstract class Shapes{
	public abstract double calculateArea();
	public abstract double calculatePerimeter();
}

class Rectangles extends Shapes{
	private double length;
	private double width;
	
	public Rectangles(double length, double width) {
		super();
		this.length = length;
		this.width = width;
	}
	
	@Override
	public double calculateArea() {
		return length*width;
	}
	@Override
	public double calculatePerimeter() {
		// TODO Auto-generated method stub
		return 2*(length+width);
	}
}
class Circles extends Shapes{
	private double radius;

	public Circles(double radius) {
		super();
		this.radius = radius;
	}

	@Override
	public double calculateArea() {
		return Math.PI*radius*radius;
	}

	@Override
	public double calculatePerimeter() {
		return 2*Math.PI*radius;
	}
}
class Triangles extends Shapes{
	private double side1;
	private double side2;
	private double side3;
	
	public Triangles(double side1, double side2, double side3) {
		super();
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}
	
	@Override
	public double calculateArea() {
		double s=(side1+side2+side3)/2;
		return Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
	}
	@Override
	public double calculatePerimeter() {
		return side1+side2+side3;
	}
}
public class Example16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shapes rectangle=new Rectangles(12.0,10.0);
		Shapes circle=new Circles(20.0);
		Shapes triangle=new Triangles(7.0,8.0,6.0);
		
		System.out.println("Rectangle:- length 12 and width 10 ");
		System.out.println("area of rectangle is: "+rectangle.calculateArea());
		System.out.println("perimeter of rectangle is: "+rectangle.calculatePerimeter());
		
		System.out.println("Circle:- radius 20 ");
		System.out.println("area of circle is: "+circle.calculateArea());
		System.out.println("perimeter of circle is: "+circle.calculatePerimeter());
		
		System.out.println("Rectangle:- side1 7, side2 8, side3 6 ");
		System.out.println("area of triangle is: "+triangle.calculateArea());
		System.out.println("perimeter of triangle is: "+triangle.calculatePerimeter());
	}

}
