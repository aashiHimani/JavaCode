package com.encapsulation;

class Rectangle{
	private double length;
	private double widht;
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}
	public double getWidht() {
		return widht;
	}
	public void setWidht(double widht) {
		this.widht = widht;
	}
}
public class Example3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle r=new Rectangle();
		r.setLength(12.0);
		r.setWidht(4.0);
		System.out.println("length: "+r.getLength()+" width: "+r.getWidht());
	}

}
