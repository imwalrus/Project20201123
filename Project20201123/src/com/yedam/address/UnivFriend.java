package com.yedam.address;

public class UnivFriend extends Friend {
	// 필드
	private String sch;
	private String clss;

	// 생성자
	public UnivFriend(String name, String pNum) {
		super(name, pNum);
	}

	// 메소드
	public String getSch() {
		return sch;
	}

	public void setSch(String sch) {
		this.sch = sch;
	}

	public String getClss() {
		return clss;
	}

	public void setClss(String clss) {
		this.clss = clss;
	}
	
	@Override
	public void showFriendInfo() {
//		super.showFriendInfo();
		System.out.println("이름 : " + super.getName() + ", 연락처 : " + super.getpNum() + ", 학교 : " + this.sch + ", 전공 : " + this.clss);
	}
}
