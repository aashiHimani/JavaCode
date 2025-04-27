package com.string.main;

public class PerformanceTestOfStringBufferAndStringBuilderClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long startTime=System.currentTimeMillis();
		StringBuffer buffer=new StringBuffer("himu");
		for(int i=0;i<100000;i++) {
			buffer.append("somu");
		}
		System.out.println("Time taken to concat with string: "+(System.currentTimeMillis()-startTime)+"ms");
		
		startTime=System.currentTimeMillis();
		StringBuilder builder=new StringBuilder("himu");
		for(int i=0;i<100000;i++) {
			builder.append("somu");
		}
		System.out.println("Time taken to concat with string: "+(System.currentTimeMillis()-startTime)+"ms");
	}

}
