package com.yedam;

public class CalExample {
	public static void main(String[] args) {
//		Calculator c1 = new Calculator();
//		c1.setColor("White");
//		c1.plus(3, 5);

		int result = Calculator.plus(3, 5); // c1.plus(3, 5);
		System.out.println(Calculator.pi);
		result = Calculator.minus(10, 5);
		System.out.println(result);

		CalExample ce1 = new CalExample();
		result = ce1.sum(3, 5);
	}

	public static int sum(int a, int b) {
		return a + b;
	}
}