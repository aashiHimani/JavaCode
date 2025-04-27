package com.generic;

import java.util.List;

public class SumOfList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> integers=List.of(2,7,9,4,6);
		List<Double> doubles=List.of(2.0, 1.5, 4.5, 2.5, 1.5);
		calculateSumOfList(integers);
		calculateSumOfList(doubles);
	}

	private static <T extends Number>void calculateSumOfList(List<T> num) {
		// TODO Auto-generated method stub
		double evenSum=0;
		double oddSum=0;
		for(T n:num) {
			if(n.doubleValue()%2==0) {
				evenSum+=n.doubleValue();
			}
			else {
				oddSum+=n.doubleValue();
			}
		}
		System.out.println("original number:"+num);
		System.out.println("even sum:"+evenSum);
		System.out.println("odd sum:"+oddSum);
	}

}
