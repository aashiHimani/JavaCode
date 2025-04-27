package com.interfaces;

interface Resizable{
	void resizeWidth(int width);
	void resizeHeight(int height);
}
class Rectangles implements Resizable{
	private int length;
	private int width;
	public Rectangles(int length, int width) {
		super();
		this.length = length;
		this.width = width;
	}
	@Override
	public void resizeWidth(int width) {
		this.width = width;
	}
	@Override
	public void resizeHeight(int height) {
		this.length = length;
	}
	public void printSize() {
		System.out.println("length:"+length+" width:"+width);
	}
}
public class Example5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangles r=new Rectangles(8,4);
		r.printSize();
		r.resizeHeight(10);
		r.resizeWidth(12);
		r.printSize();
	}

}
