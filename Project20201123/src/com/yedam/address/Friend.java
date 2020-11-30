package com.yedam.address;

public class Friend {
	// 필드
	private String name;
	private String pNum;
	// 생성자
	public Friend(String name, String pNum) {
		this.name = name;
		this.pNum = pNum;
	}
	// 메소드 (Getter, Setter)
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getpNum() {
		return pNum;
	}

	public void setpNum(String pNum) {
		this.pNum = pNum;
	}
	// 메소드 (Show~)
	public void 	showFriendInfo() {
		System.out.println("이름 : " + this.name + ", 연락처 : " + this.pNum);
	}
}
