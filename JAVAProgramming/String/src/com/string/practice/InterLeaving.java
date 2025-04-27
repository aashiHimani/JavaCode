package com.string.practice;

import java.util.HashSet;
import java.util.Set;

public class InterLeaving {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String P="WX";
		String Q="YZ";
		Set<String> res=new HashSet<>();
		allLeavings("",P,Q,res);
		res.stream().forEach(System.out::println);
		
	}

	private static void allLeavings(String string, String p, String q, Set<String> res) {
		// TODO Auto-generated method stub
		if(p.length()==0 && q.length()==0) {
			res.add(string);
			return;
		}
		if(p.length()>0) {
			allLeavings(string+p.charAt(0),p.substring(1),q,res);
		}
		if(q.length()>0) {
			allLeavings(string+q.charAt(0),p,q.substring(1),res);
		}
	}

}
