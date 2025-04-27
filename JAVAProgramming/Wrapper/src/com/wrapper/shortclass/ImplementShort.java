package com.wrapper.shortclass;

public class ImplementShort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		short b=55;
		String bb="45";
		Short x=new Short(b);
		Short y=new Short(bb);
		
		System.out.println("toString(b)="+Short.toString(b));
		
		Short z=Short.valueOf(b);
		System.out.println("valueOf(b)="+z);
		z=Short.valueOf(bb);
		System.out.println("valueOf(bb)="+z);
		z=Short.valueOf(bb,6);
		System.out.println("valueOf(bb,6)="+z);
		
		short zz=Short.parseShort(bb);
		System.out.println("parseShort(bb)="+zz);
		zz=Short.parseShort(bb,6);
		System.out.println("parseShort(bb,6)="+zz);
		
		String decimal="45";
		String octal="005";
		String hex="0x0f";
		Short dec=Short.decode(decimal);
		System.out.println("decode(45)="+dec);
		dec=Short.decode(octal);
		System.out.println("decode(005)="+dec);
		dec=Short.decode(hex);
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
		
		int e=Short.compare(x, y);
		System.out.println("compare(x, y)="+e);
		
		int f=x.compareTo(y);
		System.out.println("x.compareTo(y)="+f);
		
		short torev=45;
		System.out.println("Short.reverseBytes(torev)="+Short.reverseBytes(torev));
	}

}
