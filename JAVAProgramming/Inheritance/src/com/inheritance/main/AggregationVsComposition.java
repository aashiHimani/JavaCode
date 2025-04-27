package com.inheritance.main;

class Engine{
	public void work() {
		System.out.println("engine");
	}
}
final class Car{
	private final Engine engine;
	Car(Engine engine){
		this.engine=engine;
	}
	public void move() {
		engine.work();
		System.out.println("car");
	}
}
public class AggregationVsComposition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Engine e=new Engine();
		Car c=new Car(e);
		c.move();
	}

}
