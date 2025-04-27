package com.exceptionhandling.main;

import java.io.IOException;

/*
 * An exception is first thrown from the top of the stack and if it is not caught, 
 it drops down the call stack to the previous method. If not caught there, 
 the exception again drops down to the previous method, and so on until they are caught or until they 
 reach the very bottom of the call stack. This is called exception propagation.
 By default Unchecked Exceptions are forwarded in calling chain (propagated).
 By default, Checked Exceptions are not forwarded in calling chain (propagated).
 */

public class ExceptionPropogation {
	void m() {
		int data = 50 / 0;
	}

	void n() {
		m();
	}

	void p() {
		try {
			n();
		} catch (Exception e) {
			System.out.println("exception handled");
		}
	}

	//checked exception
	void m1() throws IOException{  
	    throw new java.io.IOException("device error");
	  }  
	  void n1(){  
	    m();  
	  }  
	  void p1(){  
	   try{  
	    n();  
	   }catch(Exception e){System.out.println("exception handeled");}  
	  }  
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExceptionPropogation obj = new ExceptionPropogation();
		obj.p();
		obj.p1();
		System.out.println("normal flow...");
	}

}
