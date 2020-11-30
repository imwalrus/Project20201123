package com.yedam.abstracts;

public class PhoneExample {
	public static void main(String[] args) {
		Phone phone = new SmartPhone();
		phone.owner = "Lee";
		phone.turnOn();
		phone.turnOff();
//		new Phone();
//		new Phone("Lee");
	}
	
}
