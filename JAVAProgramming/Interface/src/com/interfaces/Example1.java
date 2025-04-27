package com.interfaces;

interface Shape{
	public double getArea();
}
class Rectangle implements Shape{
	private double length;
	private double width;
	public Rectangle(double length, double width) {
		super();
		this.length = length;
		this.width = width;
	}
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	@Override
	public double getArea() {
		return length*width;
	}
	
}
class Triangle implements Shape{
	private double side1;
	private double side2;
	private double side3;
	public Triangle(double side1, double side2, double side3) {
		super();
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}
	public double getSide1() {
		return side1;
	}
	public void setSide1(double side1) {
		this.side1 = side1;
	}
	public double getSide2() {
		return side2;
	}
	public void setSide2(double side2) {
		this.side2 = side2;
	}
	public double getSide3() {
		return side3;
	}
	public void setSide3(double side3) {
		this.side3 = side3;
	}
	@Override
	public double getArea() {
		double s=(side1+side2+side3)*2;
		return Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
	}
	
}
class Circle implements Shape{
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
	@Override
	public double getArea() {
		return Math.PI*radius*radius;
	}
	
}
public class Example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape rectangle=new Rectangle(12.0,8.0);
		Shape triangle=new Triangle(2.0,3.0,4.0);
		Shape circle=new Circle(11.0);
		System.out.println("Area of rectangle is:"+rectangle.getArea());
		System.out.println("Area of triangle is:"+triangle.getArea());
		System.out.println("Area of circle is:"+circle.getArea());
	}

}
