package com.constructor.main;

class Box1{
	double width,height,depth;
	int boxNo;
	Box1(double w,double h,double d,int num){
		width=w;
		height=h;
		depth=d;
		boxNo=num;
	}
	Box1(){
		width=height=depth=0;
	}
	Box1(int num){
		this();
		boxNo=num;
	}
}
public class ConstructorOverloadingUsingThis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box1 b=new Box1(1);
		System.out.println(b.width);
	}

}
