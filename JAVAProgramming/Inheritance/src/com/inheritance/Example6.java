package com.inheritance;

class Animal1{
	void move() {
		System.out.println("move..");
	}
}
class Cheetah extends Animal1{
	void move() {
		System.out.println("run..");
	}
}

public class Example6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cheetah obj=new Cheetah();
		obj.move();
	}

}
