package com.yedam;

public class Car {
	// 필드(Field)
	private String company;
	private String model;
	private String color;
	private int maxSpeed;

	// 생성자(Constructor)
	public Car() {
	}

	public Car(String company) {
		this.company = company;
	}

	public Car(String company, String model) {
		this.company = company;
		this.model = model;
	}

	public Car(String company, String model, String color, int maxSpeed) {
		this.company = company;
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}

	// 메소드(Method)
	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

}
