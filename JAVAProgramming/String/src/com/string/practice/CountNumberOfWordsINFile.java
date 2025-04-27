package com.string.practice;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class CountNumberOfWordsINFile {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		String line;
		int count=0;
		FileReader file = new FileReader("C:\\Users\\himan\\eclipse-workspace\\JAVAProgramming\\String\\src\\com\\string\\practice\\Hi.txt");    
        BufferedReader br = new BufferedReader(file); 
        while((line= br.readLine()) != null) {
        	String word[]=line.split("");
        	count+=word.length;
        }
        System.out.println(count);
        br.close();
	}

}
