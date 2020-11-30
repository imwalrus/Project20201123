package com.ydm;

public class Student {
	// 필드
	private String sName;
	private String sNo;
	private String name;
	private String sClass;

	// 생성자
	public Student() {
	}

	public Student(String sName, String sNo) {
		this.sName = sName;
		this.sNo = sNo;
	}

	// 메소드
	public String getsName() {
		return sName;
	}

	public void setsName(String sName) {
		this.sName = sName;
	}

	public String getsNo() {
		return sNo;
	}

	public void setsNo(String sNo) {
		this.sNo = sNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getsClass() {
		return sClass;
	}

	public void setsClass(String sClass) {
		this.sClass = sClass;
	}

	public void showMemberInfo() {
		System.out.println("학교: " + sName + ", 학번: " + sNo + ", 이름: " + name);
	}
}