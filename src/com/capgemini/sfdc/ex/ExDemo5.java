package com.capgemini.sfdc.ex;

public class ExDemo5 {
	public static void student1(int marks) throws ArithmeticException {
		System.out.println(100 /marks);
	}

	public static void student2(int marks) {
		ExDemo5.student1(89);
	}

	public static void student3(int marks) {
		ExDemo5.student2(53);
	}

	public static void main(String[] args) {
		ExDemo5.student3(76);
	}
}
