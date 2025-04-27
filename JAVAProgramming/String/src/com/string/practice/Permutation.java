package com.string.practice;

public class Permutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		permutationWithRepition("PQR");
	}

	private static void permutationWithRepition(String string) {
		// TODO Auto-generated method stub
		System.out.println("Permuatations are:");
		outputPermutation(string,"");
	}

	private static void outputPermutation(String string, String string2) {
		// TODO Auto-generated method stub
		if(string2.length()==string.length()) {
			System.out.println(string2);
			return;
		}
		for(int i=0;i<string.length();i++) {
			outputPermutation(string,string2+string.charAt(i));
		}
	}

}
