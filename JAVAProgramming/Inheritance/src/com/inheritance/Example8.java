package com.inheritance;

class Shape1{
	public double getPerimeter() {
		return 0.0;
	}
	public double getArea() {
		return 0.0;
	}
}

class Circle extends Shape1{
	double radius;
	public Circle(double radius) {
		super();
		this.radius = radius;
	}
	public double getPerimeter() {
		return 2*Math.PI*radius;
	}
	public double getArea() {
		return Math.PI*radius*radius;
	}
}
public class Example8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle obj=new Circle(12);
		System.out.println(obj.getPerimeter()+","+obj.getArea());
	}

}
