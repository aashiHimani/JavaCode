package com.thread;

public class Basic extends Thread{
	public void run() {
		System.out.println("Hi");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Basic b=new Basic();
		b.start();
	}

}
