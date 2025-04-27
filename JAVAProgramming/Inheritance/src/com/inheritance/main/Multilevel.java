package com.inheritance.main;

class Bird{
	void show() {
		System.out.println("bird...");
	}
}
class Peacock extends Bird{
	void dance() {
		System.out.println("dance..");
	}
}
class BabyPeacock extends Peacock{
	void eat() {
		System.out.println("eating..");
	}
}
public class Multilevel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BabyPeacock b=new BabyPeacock();
		b.eat();
		b.dance();
		b.show();
	}

}
