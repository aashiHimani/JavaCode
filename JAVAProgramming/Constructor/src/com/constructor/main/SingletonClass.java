package com.constructor.main;

class Example{
	static Example instance=null;
	public int x=10;
	private Example() {
		
	}
	static public Example getInstance() {
		if(instance ==null) {
			instance =new Example();
		}
		return instance;
	}
}
public class SingletonClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Example a=Example.getInstance();
		Example b=Example.getInstance();
		a.x=a.x+10;
		System.out.println("value of a.x="+a.x);
		System.out.println("value of b.x="+b.x);
	}

}
