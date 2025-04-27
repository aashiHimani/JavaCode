package com.inheritance;

class Shape{
	public double getArea() {
		return 0.0;
	}
}
class Rectangle extends Shape{
	double length;
	double breadth;
	public Rectangle(double length,double breadth) {
		this.length=length;
		this.breadth=breadth;
	}
	public double getArea() {
		return length*breadth;
	}
}
public class Example3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle obj=new Rectangle(12.0,8.0);
		System.out.println(obj.getArea());
	}

}
