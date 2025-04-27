package com.thread;

public class OddEven {
	private static final int max=20;
	private static Object lock=new Object();
	private static boolean isEven=true;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread even=new Thread(()->{
			for(int i=2;i<=max;i+=2) {
				synchronized(lock) {
					while(!isEven) {
						try {
							lock.wait();
						}catch(InterruptedException e) {
							e.printStackTrace();
						}
					}
					System.out.println("even no is: "+i);
					isEven=false;
					lock.notify();
				}
			}
		});
		
		Thread odd=new Thread(()->{
			for(int i=1;i<=max;i+=2) {
				synchronized(lock) {
					while(isEven) {
						try {
							lock.wait();
						}catch(InterruptedException e) {
							e.printStackTrace();
						}
					}
					System.out.println("odd no is: "+i);
					isEven=true;
					lock.notify();
				}
			}
		});
		even.start();
		odd.start();
	}

}
