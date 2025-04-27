package com.exceptionhandling.main;

import java.io.IOException;

class M1 {
	void method() throws IOException {
		throw new IOException("error");
	}
}
public class DeclareExceptionOccur {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		M1 m = new M1();
		m.method();

		System.out.println("normal flow...");
	}

}
