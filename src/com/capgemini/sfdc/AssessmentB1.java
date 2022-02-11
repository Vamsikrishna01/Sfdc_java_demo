package com.capgemini.sfdc;

import java.util.Scanner;
public class AssessmentB1 {
	
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			
		    int n=sc.nextInt();
			
			int i;
			int t = 1;
			
			for (i =n; i > 0; i--) {
			      t = i * t;
			}
						
	       System.out.println(t);
			
		}

}
