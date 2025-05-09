package com.string.main;

public class StringBuilderClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder sb=new StringBuilder();
		System.out.println(sb.capacity());//default 16    
		sb.append("Hello");    
		System.out.println(sb.capacity());//now 16    
		sb.append("Java is my favourite language");    
		System.out.println(sb.capacity());//now (16*2)+2=34 i.e (oldcapacity*2)+2    
		sb.ensureCapacity(10);//now no change    
		System.out.println(sb.capacity());//now 34    
		sb.ensureCapacity(50);//now (34*2)+2    
		System.out.println(sb.capacity());//now 70 
		
		sb.append(" himu");
		System.out.println(sb);
		sb.insert(0, "hi");
		System.out.println(sb);
		sb.replace(0, 2, "good");
		System.out.println(sb);
		sb.delete(0, 4);
		System.out.println(sb);
		sb.reverse();
		System.out.println(sb);
	}

}
