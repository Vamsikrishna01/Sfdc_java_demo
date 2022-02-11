package com.capgemini.sfdc.oop;

class Calc {
static void marks(int i, int j) {
	System.out.println(i + j);
}

static void marks(int i, int j, int k) {
	System.out.println(i + j + k);
}

static void marks(int i, int j, int k, int l) {
	System.out.println(i + j + k + l);
}
}

public class OverloadDemo {

public static void main(String[] args) {
	Calc.marks(10, 20);
	Calc.marks(10, 20, 30);
	Calc.marks(10, 20, 30, 40);

}

}

