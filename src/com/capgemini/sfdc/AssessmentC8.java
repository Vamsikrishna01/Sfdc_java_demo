package com.capgemini.sfdc;

import java.util.Scanner;
public class AssessmentC8 {
		public static void main(String[] args) {
			// TODO Auto-generated method 
			Scanner sc=new Scanner(System.in);
			int num=sc.nextInt();
			int rev=0;
			int d;
			while(num!=0)
			{
				d=num%10;
				rev=rev*10+d;
				num/=10;
			}
			System.out.println(rev);

		}
}
