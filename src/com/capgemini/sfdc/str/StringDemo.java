package com.capgemini.sfdc.str;

public class StringDemo {
	public static void main(String[] args) {
		String str="Vamsi";
		String str2="VAMSI";
		
		System.out.println(str==str2);
		System.out.println(str.equals(str2));
		
		System.out.println(str.equalsIgnoreCase(str2));
	}

}
