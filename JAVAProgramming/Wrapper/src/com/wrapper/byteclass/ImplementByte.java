package com.wrapper.byteclass;

public class ImplementByte {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte b=55;
		String bb="45";
		Byte x=new Byte(b);
		Byte y=new Byte(bb);
		
		System.out.println("toString(b)="+Byte.toString(b));
		
		Byte z=Byte.valueOf(b);
		System.out.println("valueOf(b)="+z);
		z=Byte.valueOf(bb);
		System.out.println("valueOf(bb)="+z);
		z=Byte.valueOf(bb,6);
		System.out.println("valueOf(bb,6)="+z);
		
		byte zz=Byte.parseByte(bb);
		System.out.println("parseByte(bb)="+zz);
		zz=Byte.parseByte(bb,6);
		System.out.println("parseByte(bb,6)="+zz);
		
		String decimal="45";
		String octal="005";
		String hex="0x0f";
		Byte dec=Byte.decode(decimal);
		System.out.println("decode(45)="+dec);
		dec=Byte.decode(octal);
		System.out.println("decode(005)="+dec);
		dec=Byte.decode(hex);
		System.out.println("decode(0x0f)="+dec);
		
		System.out.println("byteValue(x)="+x.byteValue());
		System.out.println("shortValue(x)="+x.shortValue());
		System.out.println("intValue(x)="+x.intValue());
		System.out.println("longValue(x)="+x.longValue());
		System.out.println("floatValue(x)="+x.floatValue());
		System.out.println("doubleValue(x)="+x.doubleValue());
		
		int hash=x.hashCode();
		System.out.println("hashcode(x)="+hash);
		
		boolean eq=x.equals(y);
		System.out.println("x.equals(y)="+eq);
		
		int e=Byte.compare(x, y);
		System.out.println("compare(x, y)="+e);
		
		int f=x.compareTo(y);
		System.out.println("x.compareTo(y)="+f);
	}

}
