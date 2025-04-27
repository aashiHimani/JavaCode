package com.polymorphism;

abstract class Shapess{
	public abstract void draw();
	public abstract double calculateArea();
}
class Circless extends Shapess{
	private double radius;
	public Circless(double radius) {
		this.radius = radius;
	}
	@Override
	public void draw() {
		System.out.println("Circle draw");
	}
	@Override
	public double calculateArea() {
		return  Math.PI*radius*radius;
	}
}
class Square extends Shapess{
	private double side;
	public Square(double side) {
		this.side = side;
	}
	@Override
	public void draw() {
		System.out.println("Square draw");
	}
	@Override
	public double calculateArea() {
		return side*side;
	}
}
class Triangless extends Shapess{
	private double side1;
	private double side2;
	private double side3;
	public Triangless(double side1, double side2, double side3) {
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}
	@Override
	public void draw() {
		System.out.println("Triangle draw");
	}
	@Override
	public double calculateArea() {
		double s=(side1+side2+side3)/2;
		return Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
	}
}
public class Example8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circless c=new Circless(2.0);
		Square s=new Square(4.0);
		Triangless t=new Triangless(8.0,7.0,6.0);
		c.draw();
		System.out.println("Area of circle is: "+c.calculateArea());
		s.draw();
		System.out.println("Area of square is: "+s.calculateArea());
		t.draw();
		System.out.println("Area of triangle is: "+t.calculateArea());

	}

}
