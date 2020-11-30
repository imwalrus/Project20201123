package com.yedam.Wrapper;

public class AutoBoxingUnBoxingExample {
	public static void main(String[] args) {
		// 자동 Boxing
		Integer obj = 100;
		System.out.println("value: " + obj.intValue());

		// 대입 시 자동 Unboxing
		int Value = obj;
		System.out.println("value: " + Value);

		// 연산 시 자동 Unboxing 
		Integer result = obj + 100;
		System.out.println("result: " + result);
	}
}
