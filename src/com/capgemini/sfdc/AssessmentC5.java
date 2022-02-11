package com.capgemini.sfdc;
import java.util.Scanner;

public class AssessmentC5 {

	
		public static void main(String[]args)
		{
			
			
			System.out.print("Enter Number of Marks");
			System.out.println("\t"+"Enter Your Name");
			
			Scanner mark=new Scanner(System.in);
			int marks=mark.nextInt();
			
			String STUDENTNAME=mark.nextLine();
			if(marks>=90)
			{
				System.out.println("EXCELLENT MARKS,CONGRATULATION"+STUDENTNAME+" YOU'RE MY STUDENT");
			}
			else if(marks>=50)
			{
				System.out.println("GOOD MARKS,CONGRATULATION"+STUDENTNAME+" TRY TO IMPROVE YOUR MARKS");
			}
			else
			{
				System.out.println("Don't worry my student,you Do not be embarrassed by your MARKS, learn from them and start again"+STUDENTNAME);
			}
		}

}
