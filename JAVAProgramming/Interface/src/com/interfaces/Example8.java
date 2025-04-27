package com.interfaces;

interface Playable{
	public void play();
}
class Football implements Playable{
	@Override
	public void play() {
		System.out.println("Football is playing..");
	}
}
class Volleyball implements Playable{
	@Override
	public void play() {
		System.out.println("Volleyball is playing..");
	}
}
class Basketball implements Playable{
	@Override
	public void play() {
		System.out.println("Basketball is playing..");	
	}
}
public class Example8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Playable p[]= {new Football(),new Volleyball(),new Basketball()};
		for(Playable pp:p) {
			pp.play();
		}
	}

}
