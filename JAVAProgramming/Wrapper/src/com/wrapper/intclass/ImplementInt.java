package com.wrapper.intclass;

public class ImplementInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int b=55;
		String bb="45";
		Integer x=new Integer(b);
		Integer y=new Integer(bb);
		
		System.out.println("toString(b)="+Integer.toString(b));
		System.out.println("toHexString(b)="+Integer.toHexString(b));
		System.out.println("toOctalString(b)="+Integer.toOctalString(b));
		System.out.println("toBinaryString(b)="+Integer.toBinaryString(b));
		
		Integer z=Integer.valueOf(b);
		System.out.println("valueOf(b)="+z);
		z=Integer.valueOf(bb);
		System.out.println("valueOf(bb)="+z);
		z=Integer.valueOf(bb,6);
		System.out.println("valueOf(bb,6)="+z);
		
		int zz=Integer.parseInt(bb);
		System.out.println("parseInt(bb)="+zz);
		zz=Integer.parseInt(bb,6);
		System.out.println("parseInt(bb,6)="+zz);
		
		int prop=Integer.getInteger("sun.arch.data.model");
		System.out.println("getInteger(sun.arch.data.model)"+prop);
		System.out.println("getInteger(abcd)"+Integer.getInteger("abcd"));
		System.out.println("getInteger(abcd,10)"+Integer.getInteger("abcd",10));
		
		String decimal="45";
		String octal="005";
		String hex="0x0f";
		Integer dec=Integer.decode(decimal);
		System.out.println("decode(45)="+dec);
		dec=Integer.decode(octal);
		System.out.println("decode(005)="+dec);
		dec=Integer.decode(hex);
		System.out.println("decode(0x0f)="+dec);
		
		int valrot=2;
		System.out.println("rotateLeft(0000 0000 0000 0010,2)="+Integer.rotateLeft(valrot, 2));
		System.out.println("rotateRight(0000 0000 0000 0010,3)="+Integer.rotateRight(valrot, 3));
	
		System.out.println("byteValue(x)="+x.byteValue());
		System.out.println("shortValue(x)="+x.shortValue());
		System.out.println("intValue(x)="+x.intValue());
		System.out.println("longValue(x)="+x.longValue());
		System.out.println("floatValue(x)="+x.floatValue());
		System.out.println("doubleValue(x)="+x.doubleValue());
		
		int value=45;
		System.out.println("Integer.bitCount(value)="+Integer.bitCount(value));
		System.out.println("Integer.numberOfLeadingZeros(value)="+Integer.numberOfLeadingZeros(value));
		System.out.println("Integer.highestOneBit(value)="+Integer.highestOneBit(value));
		System.out.println("Integer.lowestOneBit(value)="+Integer.lowestOneBit(value));
		System.out.println("Integer.reverse(value)="+Integer.reverse(value));
		System.out.println("Integer.reverseBytes(value)="+Integer.reverseBytes(value));
		System.out.println("Integer.signum(value)="+Integer.signum(value));
		
		int hash=x.hashCode();
		System.out.println("hashcode(x)="+hash);
		
		boolean eq=x.equals(y);
		System.out.println("x.equals(y)="+eq);
		
		int e=Integer.compare(x, y);
		System.out.println("compare(x, y)="+e);
		
		int f=x.compareTo(y);
		System.out.println("x.compareTo(y)="+f);
	}

}
