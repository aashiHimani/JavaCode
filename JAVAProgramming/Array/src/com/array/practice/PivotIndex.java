package com.array.practice;

public class PivotIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[]= {1,7,3,6,5,6};
		int pivotIndex=findPivotIndex(nums);
		System.out.println(pivotIndex);
	}

	private static int findPivotIndex(int[] nums) {
		// TODO Auto-generated method stub
		int totalSum=0,leftSum=0;
		for(int num:nums) {
			totalSum+=num;
		}
		
		for(int i=0;i<=nums.length;i++) {
			if(leftSum==totalSum-leftSum-nums[i]) {
				return i;
			}
			leftSum+=nums[i];
		}
		return -1;
	}

}


//Input: nums = [1,7,3,6,5,6]
//Output: 3
//Explanation:
//The pivot index is 3.
//Left sum = nums[0] + nums[1] + nums[2] = 1 + 7 + 3 = 11
//Right sum = nums[4] + nums[5] = 5 + 6 = 11