package com.inheritance.main;

class Vegetable{
	void display() {
		System.out.println("vegetable...");
	}
}
class Onion extends Vegetable{
	void show() {
		System.out.println("onion...");
	}
}
class Potato extends Vegetable{
	void result() {
		System.out.println("potato...");
	}
}
public class Hierarchical {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Potato p=new Potato();
		p.result();
		p.display();
		Onion o=new Onion();
		o.show();
		o.display();
	}

}
