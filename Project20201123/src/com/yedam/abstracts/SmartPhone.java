package com.yedam.abstracts;

public class SmartPhone extends Phone {

	@Override
	public void ring() {
		System.out.println("스마트폰 벨..");
	}
	
	@Override
	public void turnOff() {
		System.out.println("폰 전원을 끕니다.");
	}
}