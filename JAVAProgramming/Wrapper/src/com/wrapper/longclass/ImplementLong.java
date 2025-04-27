package com.wrapper.longclass;

public class ImplementLong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long b=55;
		String bb="45";
		Long x=new Long(b);
		Long y=new Long(bb);
		
		System.out.println("toString(b)="+Long.toString(b));
		System.out.println("toHexString(b)="+Long.toHexString(b));
		System.out.println("toOctalString(b)="+Long.toOctalString(b));
		System.out.println("toBinaryString(b)="+Long.toBinaryString(b));
		
		Long z=Long.valueOf(b);
		System.out.println("valueOf(b)="+z);
		z=Long.valueOf(bb);
		System.out.println("valueOf(bb)="+z);
		z=Long.valueOf(bb,6);
		System.out.println("valueOf(bb,6)="+z);
		
		long zz=Long.parseLong(bb);
		System.out.println("parseInt(bb)="+zz);
		zz=Long.parseLong(bb,6);
		System.out.println("parseInt(bb,6)="+zz);
		
		long prop=Long.getLong("sun.arch.data.model");
		System.out.println("getLong(sun.arch.data.model)"+prop);
		System.out.println("getLong(abcd)"+Long.getLong("abcd"));
		System.out.println("getLong(abcd,10)"+Long.getLong("abcd",10));
		
		String decimal="45";
		String octal="005";
		String hex="0x0f";
		Long dec=Long.decode(decimal);
		System.out.println("decode(45)="+dec);
		dec=Long.decode(octal);
		System.out.println("decode(005)="+dec);
		dec=Long.decode(hex);
		System.out.println("decode(0x0f)="+dec);
		
		long valrot=2;
		System.out.println("rotateLeft(0000 0000 0000 0010,2)="+Long.rotateLeft(valrot, 2));
		System.out.println("rotateRight(0000 0000 0000 0010,3)="+Long.rotateRight(valrot, 3));
	
		System.out.println("byteValue(x)="+x.byteValue());
		System.out.println("shortValue(x)="+x.shortValue());
		System.out.println("intValue(x)="+x.intValue());
		System.out.println("longValue(x)="+x.longValue());
		System.out.println("floatValue(x)="+x.floatValue());
		System.out.println("doubleValue(x)="+x.doubleValue());
		
		long value=45;
		System.out.println("Integer.bitCount(value)="+Long.bitCount(value));
		System.out.println("Integer.numberOfLeadingZeros(value)="+Long.numberOfLeadingZeros(value));
		System.out.println("Integer.highestOneBit(value)="+Long.highestOneBit(value));
		System.out.println("Integer.lowestOneBit(value)="+Long.lowestOneBit(value));
		System.out.println("Integer.reverse(value)="+Long.reverse(value));
		System.out.println("Integer.reverseBytes(value)="+Long.reverseBytes(value));
		System.out.println("Integer.signum(value)="+Long.signum(value));
		
		int hash=x.hashCode();
		System.out.println("hashcode(x)="+hash);
		
		boolean eq=x.equals(y);
		System.out.println("x.equals(y)="+eq);
		
		int e=Long.compare(x, y);
		System.out.println("compare(x, y)="+e);
		
		int f=x.compareTo(y);
		System.out.println("x.compareTo(y)="+f);
	}

}
