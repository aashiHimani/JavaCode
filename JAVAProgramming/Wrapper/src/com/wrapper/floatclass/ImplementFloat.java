package com.wrapper.floatclass;

public class ImplementFloat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float b=55.05f;
		String bb="45";
		Float x=new Float(b);
		Float y=new Float(bb);
		
		System.out.println("toString(b)="+Float.toString(b));
		
		Float z=Float.valueOf(b);
		System.out.println("valueOf(b)="+z);
		z=Float.valueOf(bb);
		System.out.println("valueOf(bb)="+z);
		
		Float zz=Float.parseFloat(bb);
		System.out.println("parseInt(bb)="+zz);
		
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
		
		int e=Float.compare(x, y);
		System.out.println("compare(x, y)="+e);
		
		int f=x.compareTo(y);
		System.out.println("x.compareTo(y)="+f);
		
		Float d=Float.valueOf("1010.54789654123654");
		System.out.println("isNan(d)="+d.isNaN());
		System.out.println("Float.isNaN(45.12452F)="+Float.isNaN(45.12452F));
		
		d=Float.valueOf(Float.POSITIVE_INFINITY+1);
		System.out.println("Float.isInfinite(d)="+Float.isInfinite(d.floatValue()));
		float dd = 10245.21452F;
        System.out.println("Float.toHexString(dd) = "+ Float.toHexString(dd));
 
        int float_to_int = Float.floatToIntBits(dd);
        System.out.println("Float.floatToIntBits(dd) = "+ float_to_int);
 
        float int_to_float= Float.intBitsToFloat(float_to_int);
        System.out.println("Float.intBitsToFloat(float_to_long) = "+ int_to_float);
	}

}
