package com.capgemini.sfdc.ex;

public class ExDemo4 {
	// throws 
			// your friend's uncle's car
		public static void car(int num) throws ArithmeticException {
			System.out.println(10 / num);
		}

		public static void uncle(int num) {
			ExDemo4.car(num);
		}

		public static void friend(int num) {
			ExDemo4.uncle(num);
		}

		public static void main(String[] args) {
			// you
			ExDemo4.friend(5);
		}
}
