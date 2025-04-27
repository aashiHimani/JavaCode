package com.array.reflectarray;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ImplementReflectArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr=(int[])Array.newInstance(int.class, 5);
		System.out.println(Arrays.toString(arr));
		Array.setInt(arr, 0, 10);
		Array.setInt(arr, 1, 20);
		Array.setInt(arr, 2, 30);
		Array.setInt(arr, 3, 40);
		Array.setInt(arr, 4, 50);
		System.out.println(Arrays.toString(arr));
		System.out.println("element at index 0:"+Array.getInt(arr, 0));
	}

}
