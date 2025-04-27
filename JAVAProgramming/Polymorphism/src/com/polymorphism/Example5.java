package com.polymorphism;

class Sports{
	public void play() {
		System.out.println("Playing sports...");
	}
}
class Football extends Sports{
	public void play() {
		System.out.println("Playing Football...");
	}
}
class Basketball extends Sports{
	public void play() {
		System.out.println("Playing Basketball...");
	}
}
class Rugby extends Sports{
	public void play() {
		System.out.println("Playing Rugby...");
	}
}

public class Example5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sports[] s= {new Football(),new Basketball(),new Rugby()};
		for(Sports ss:s) {
			ss.play();
		}
	}

}
