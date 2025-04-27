package com.constructor.main;

public class InitBlock {
	{
		System.out.println("init block");
	}
	InitBlock(){
		System.out.println("default block");
	}
	InitBlock(int x){
		System.out.println(x);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new InitBlock();
		new InitBlock(2);
	}

}
