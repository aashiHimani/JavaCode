package com.constructor.main;

class Complex{
	private double re,im;

	public Complex(double re, double im) {
		super();
		this.re = re;
		this.im = im;
	}
	Complex(Complex c){
		re=c.re;
		im=c.im;
	}
	@Override
	public String toString() {
		return "Complex [re=" + re + ", im=" + im + "]";
	}
}
public class CopyConstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Complex c1=new Complex(5.0,8.9);
		Complex c2=new Complex(c1);
		Complex c3=c2;
		System.out.println(c2);
		System.out.println(c3);
	}

}
