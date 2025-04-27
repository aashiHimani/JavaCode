package com.functionalinterface.main;

@FunctionalInterface
interface Square{
	int calculate(int x);
}
public class Implementation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Thread(new Runnable() {
			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("thread created");
			}
		}).start();
		
		
		//using lamba expression
		//new Thread(()-> {System.out.println("hi");}).start();
		
		int a=5;
		Square s=(int x)->x*x;
		System.out.println(s.calculate(a));
	}

}
