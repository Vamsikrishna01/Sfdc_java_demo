package com.capgemini.sfdc;

import java.util.Scanner;
public class AssessmentC6 {
		public static void main(String[] args) {
			System.out.println("Enter two numbers");
			
			Scanner num=new Scanner(System.in);
			int num1=num.nextInt();
			int num2=num.nextInt();
			int num3=num1+num2;
			int num4=num1*num2;
		  System.out.println("SUM OF TWO NUMBERS="+num3);
		  System.out.println("PRODUCT OF TWO NUMBERS="+num4);
		}
}
