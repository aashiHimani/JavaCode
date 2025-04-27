package com.constructor.main;

class Box{
	double width,height,depth;
	Box(double w,double h,double d){
		width=w;
		height=h;
		depth=d;
	}
	Box(){
		width=height=depth=0;
	}
	Box(double len){
		width=height=depth=len;
	}
	double volume() {
		return width*height*depth;
	}
}
public class ConstructorOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box b=new Box(10,20,30);
		Box b1=new Box();
		Box b2=new Box(5);
		System.out.println(b.volume());
		System.out.println(b1.volume());
		System.out.println(b2.volume());
	}

}
