package com.capgemini.sfdc.Day2;

class studentdetails {
	static String studentclass;
	int sid;
	String studentname;
	double fees;
	
}

public class DemoClass {
	public static void main(String[] args) {
		studentdetails.studentclass="10th";
		System.out.println(studentdetails.studentclass);
		studentdetails obj =new studentdetails();
		obj.sid=156;
		System.out.println(obj.sid);
		obj.studentname="vamsi";
		System.out.println(obj.studentname);
		obj.fees=56000;
		System.out.println(obj.fees);
	}

}
