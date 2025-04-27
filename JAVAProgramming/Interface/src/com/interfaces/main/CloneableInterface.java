package com.interfaces.main;

class Az implements Cloneable{
	int i;
	String s;
	public Az(int i, String s) {
		super();
		this.i = i;
		this.s = s;
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
}
public class CloneableInterface {

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		Az a=new Az(1,"himu");
		Az b=(Az)a.clone();
		System.out.println(b.i);
		System.out.println(b.s);
	}

}
