package com.wrapper.doubleclass;

public class ImplementDouble {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double b=55.05;
		String bb="45";
		Double x=new Double(b);
		Double y=new Double(bb);
		
		System.out.println("toString(b)="+Double.toString(b));
		
		Double z=Double.valueOf(b);
		System.out.println("valueOf(b)="+z);
		z=Double.valueOf(bb);
		System.out.println("valueOf(bb)="+z);
		
		Double zz=Double.parseDouble(bb);
		System.out.println("parseDouble(bb)="+zz);
		
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
		
		int e=Double.compare(x, y);
		System.out.println("compare(x, y)="+e);
		
		int f=x.compareTo(y);
		System.out.println("x.compareTo(y)="+f);
		
		Double d=Double.valueOf("1010.54789654123654");
		System.out.println("isNan(d)="+d.isNaN());
		System.out.println("Double.isNaN(45.12452F)="+Double.isNaN(45.12452F));
		
		d=Double.valueOf(Double.POSITIVE_INFINITY+1);
		System.out.println("Double.isInfinite(d)="+Double.isInfinite(d.doubleValue()));
		Double dd = 10245.21452;
        System.out.println("Double.toHexString(dd) = "+ Double.toHexString(dd));
 
        long double_to_long=Double.doubleToLongBits(dd);
        System.out.println("Double.doubleToLongBits(dd) = "+ double_to_long);
        double long_to_double = Double.longBitsToDouble(double_to_long);
        System.out.println("Double.longBitsToDouble(dd) = "+ long_to_double);
 
	}

}
