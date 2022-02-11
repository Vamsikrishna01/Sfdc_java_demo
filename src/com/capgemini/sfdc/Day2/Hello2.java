package com.capgemini.sfdc.Day2;

public class Hello2 {
	public static void calculateAndPrintmarks(double sub1, double sub2,double sub3 ) {
			double totalmarks = sub1+sub2+sub3;
			System.out.println(sub1);
			System.out.println(sub2);
			System.out.println(sub3);
			System.out.println("total marks of the students =" + totalmarks);
		}

		public static void main(String[] args) {

			double sub1,sub2,sub3;

			System.out.println("Suresh marks");
			sub1 = 50;
			sub2 = 69;
			sub3= 83;
			calculateAndPrintmarks(sub1,sub2,sub3);

			System.out.println("Duresh marks");
			sub1 = 60;
			sub2 = 89;
			sub3= 73;
			calculateAndPrintmarks(sub1,sub2,sub3);

			System.out.println("Pooja marks");
			sub1 = 76;
			sub2 = 45;
			sub3= 98;
			calculateAndPrintmarks(sub1,sub2,sub3);

		}

}
