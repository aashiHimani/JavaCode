package com.polymorphism;

abstract class Shap{
	public abstract void draw();
	public abstract double calculateArea();
}
class Circl extends Shap{
	private double radius;
	public Circl(double radius) {
		this.radius = radius;
	}
	public double getRadius() {
		return radius;
	}
	@Override
	public void draw() {
		System.out.println("Circle draw");
	}
	@Override
	public double calculateArea() {
		return Math.PI*radius*radius;
	}
}
class Cylinder extends Circl{
	private double height;
	public double getHeight() {
		return height;
	}
	public Cylinder(double height,double radius) {
		super(radius);
		this.height = height;
	}

	@Override
	public void draw() {
		System.out.println("Cylinder draw");
	}

	@Override
	public double calculateArea() {
		double circleArea=super.calculateArea();
		double sideArea=2*Math.PI*getRadius()*height;
		return 2*(circleArea+sideArea);
	}
	
}
public class Example12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circl c=new Circl(2.0);
		Cylinder cc=new Cylinder(4.0,7.0);
		drawAndCalculate(c);
		drawAndCalculate(cc);
	}
	public static void drawAndCalculate(Shap shap) {
		shap.draw();
		double area=shap.calculateArea();
		System.out.println("area is: "+area);
	}
}
