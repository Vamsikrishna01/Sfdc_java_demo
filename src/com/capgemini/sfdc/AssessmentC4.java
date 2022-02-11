package com.capgemini.sfdc;

import java.util.Random;
public class AssessmentC4 {

		public static void main(String[] args)
		{
			Random rand = new Random();
			
			int randInt;
			  
	        System.out.print("Random Integers: ");
	        
	        for (int i = 1 ; i <= 5 ; i++) {
	        	randInt = rand.nextInt(100);
	        	System.out.print(randInt+" ");	
	        }
		
		
	    }

}
