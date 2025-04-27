package com.oops;

class Dog{
	private String name;
	private String breed;
	public Dog(String name, String breed) {
		super();
		this.name = name;
		this.breed = breed;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBreed() {
		return breed;
	}
	public void setBreed(String breed) {
		this.breed = breed;
	}
	
}
public class Example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog d=new Dog("Tomy","Bulldog");
		System.out.println("name of dog is "+ d.getName()+" and breed is "+d.getBreed());
		d.setName("Gogo");
		d.setBreed("german shepherd");
		System.out.println("name of dog is "+ d.getName()+" and breed is "+d.getBreed());
	}

}
