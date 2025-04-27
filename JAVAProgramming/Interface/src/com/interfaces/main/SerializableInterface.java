package com.interfaces.main;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Ax implements Serializable{
	int i;
	String s;
	public Ax(int i, String s) {
		super();
		this.i = i;
		this.s = s;
	}
}
public class SerializableInterface {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Ax a=new Ax(1,"himu");
		FileOutputStream f=new FileOutputStream("C:\\Users\\himan\\eclipse-workspace\\JAVAProgramming\\Interface\\src\\com\\interfaces\\main\\xyz.txt");
		ObjectOutputStream o=new ObjectOutputStream(f);
		o.writeObject(a);
		
		FileInputStream fi=new FileInputStream("C:\\Users\\himan\\eclipse-workspace\\JAVAProgramming\\Interface\\src\\com\\interfaces\\main\\xyz.txt");
		ObjectInputStream oi=new ObjectInputStream(fi);
		Ax b=(Ax)oi.readObject();
		System.out.println(b.i+" "+b.s);
		o.close();
		oi.close();
		
	}

}
