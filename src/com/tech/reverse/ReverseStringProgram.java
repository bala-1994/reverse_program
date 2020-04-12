package com.tech.reverse;

public class ReverseStringProgram {
	public static void main(String[] args) {

		String str="Balaiah";
		char[] ch=str.toCharArray();
		String reverse="";
		
		for( int i=ch.length-1;i>=0;i--) {
			reverse=reverse+ch[i];
		}
		System.out.println(str);
		System.out.println(reverse);
	}
}
