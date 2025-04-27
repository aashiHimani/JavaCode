package com.interfaces;

interface Sortable{
	public void sort(int arr[]);
}
class BubbleSort implements Sortable{
	@Override
	public void sort(int[] arr) {
		int n=arr.length;
		for(int i=0;i<n-1;i++) {
			for(int j=0;j<n-i-1;j++) {
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
	}
	
}
class SelectionSort implements Sortable{
	@Override
	public void sort(int[] arr) {
		// TODO Auto-generated method stub
		int n=arr.length;
		for(int i=0;i<n-1;i++) {
			int minIndex=i;
			for(int j=i+1;j<n;j++) {
				if(arr[j]<arr[minIndex]) {
					minIndex=j;
				}
			}
			int temp=arr[i];
			arr[i]=arr[minIndex];
			arr[minIndex]=temp;
		}
	}
	
}
public class Example7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {3,9,5,1,8,4,0};
		Sortable bs=new BubbleSort();
		Sortable ss=new SelectionSort();
		
		bs.sort(arr);
		System.out.println("Bubble sort");
		printArray(arr);
		
		ss.sort(arr);
		System.out.println("Selection sort");
		printArray(arr);
		
		
	}
	private static void printArray(int arr[]) {
		for(int num:arr) {
			System.out.print(num+" ");
		}
		System.out.println();
	}
}
