package com.yedam.address;

public class CompFriend extends Friend {
	// 필드
	private String com;
	private String dept;

	// 생성자
	public CompFriend(String name, String pNum) {
		super(name, pNum);
	}

	// 메소드
	public String getCom() {
		return com;
	}

	public void setCom(String com) {
		this.com = com;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	@Override
	public void showFriendInfo() {
//		super.showFriendInfo();
		System.out.println("이름 : " + super.getName() + ", 연락처 : " + super.getpNum() + ", 회사 : " + this.com + ", 부서 : " + this.dept);
	}
}
