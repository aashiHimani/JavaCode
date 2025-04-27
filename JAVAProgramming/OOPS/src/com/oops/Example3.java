package com.oops;

class Rectangle{
	private double width;
	private double height;
	
	public Rectangle(double width, double height) {
		super();
		this.width = width;
		this.height = height;
	}
	
	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getArea() {
		return width*height;
	}
	public double getPerimeter() {
		return 2*(width+height);
	}
}
public class Example3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle r=new Rectangle(20.0,12.0);
		System.out.println("area of rectangle is  "+ r.getArea()+" and perimeter is "+r.getPerimeter());
		r.setWidth(9.0);
		r.setHeight(6.0);
		System.out.println("area of rectangle is  "+ r.getArea()+" and perimeter is "+r.getPerimeter());
	}

}
