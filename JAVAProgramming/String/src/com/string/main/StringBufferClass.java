package com.string.main;

public class StringBufferClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb=new StringBuffer();
		System.out.println("default capacity:"+sb.capacity()); //capacity
		sb.append("somu");	//append
		System.out.println("after append:"+sb);
		System.out.println(sb.capacity());
		sb.insert(1, "HI my name is himani kumari");//insert
		System.out.println("after insertion:"+sb);
		System.out.println(sb.capacity());
		sb.ensureCapacity(10);//now no change
		System.out.println(sb.capacity());
		sb.ensureCapacity(40);
		System.out.println(sb.capacity());
		sb.replace(1, 3, "chimpu");//replace
		System.out.println("after replace:"+sb);
		sb.delete(1, 11);//delete
		System.out.println("after delete:"+sb);
		sb.reverse();	//reverse
		System.out.println("after reverse:"+sb);
	}

}
