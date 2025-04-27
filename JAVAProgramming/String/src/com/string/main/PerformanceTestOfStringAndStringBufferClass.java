package com.string.main;

public class PerformanceTestOfStringAndStringBufferClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long startTime=System.currentTimeMillis();
		concatWithString();
		System.out.println("Time taken to concat with string: "+(System.currentTimeMillis()-startTime)+"ms");
		startTime=System.currentTimeMillis();
		concatWithStringBuffer();
		System.out.println("Time taken to concat with string buffer: "+(System.currentTimeMillis()-startTime)+"ms");
	}

	private static String concatWithStringBuffer() {
		// TODO Auto-generated method stub
		StringBuffer sb=new StringBuffer("himu");
		for(int i=0;i<100000;i++) {
			sb.append("somu");
		}
		return sb.toString();
	}

	private static String concatWithString() {
		// TODO Auto-generated method stub
		String s="Himu";
		for(int i=0;i<100000;i++) {
			s+=" somu";
		}
		return s;
	}

}
