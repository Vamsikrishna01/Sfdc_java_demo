package com.capgemini.sfdc;

import java.util.Scanner;
public class AssessmentC3 {

		public static void main(String[] args)
		{
			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			
			int a = n % 2 == 0 ? n + 2 : n + 1;
			int b = n % 2 == 0 ? n - 1 : n - 2;
			
			System.out.println("Smallest even number to this is " + a );
			System.out.println("Biggest odd number to this is " + b );
			
		
	    }
}
