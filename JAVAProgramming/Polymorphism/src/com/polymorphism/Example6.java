package com.polymorphism;

abstract class Shapes{
	public abstract double getArea();
	public abstract double getPerimeter();
}
class Circles extends Shapes{
	private double radius;
	public Circles(double radius) {
		super();
		this.radius = radius;
	}
	public double getArea() {
		return Math.PI*radius*radius;
	}
	public double getPerimeter() {
		return 2*Math.PI*radius;
	}
}
class Rectangles extends Shapes{
	private double length;
	private double width;
	public Rectangles(double length, double width) {
		super();
		this.length = length;
		this.width = width;
	}
	public double getArea() {
		return length*width;
	}
	public double getPerimeter() {
		return 2*(length+width);
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
		public double getArea() {
			double s=(side1+side2+side3)/2;
			return Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
		}
		public double getPerimeter() {
			return side1+side2+side3;
		}
}
public class Example6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circles c=new Circles(2.0);
		Rectangles r=new Rectangles(4.0,3.0);
		Triangles t=new Triangles(8.0,7.0,6.0);
		System.out.println("Area of circle is: "+c.getArea()+"\n perimete of circle is:"+c.getPerimeter());
		System.out.println("Area of rectangle is: "+r.getArea()+"\n perimete of rectangle is:"+r.getPerimeter());
		System.out.println("area of trianle is: "+t.getArea()+"\n perimete of triangle is:"+t.getPerimeter());

	}

}
