package com.yedam.address;

import java.util.Scanner;

public class FriendAddress1 {

	static Scanner scn = new Scanner(System.in);
	static Friend[] friends = new Friend[100];

	// 주소록 생성 프로그램...
	public static void main(String[] args) {

		while (true) {
			System.out.println("--------------------------------------------------------------------------------");
			System.out.println("① 친구등록 ② 학교친구 ③ 회사친구 ④ 전체리스트 ⑤ 조회 ⑥ 종료");
			System.out.println("--------------------------------------------------------------------------------");
			System.out.print("선택:> ");

			int selectNo = scn.nextInt();
			scn.nextLine();
			if (selectNo == 1) {
				addFriend();

			} else if (selectNo == 2) {
				addUnivFriend();

			} else if (selectNo == 3) {
				addCompFriend();

			} else if (selectNo == 4) {
				showFriendList();

			} else if (selectNo == 5) {
				searchFriend();

			} else if (selectNo == 6) {
				break;
			}
		}

		System.out.println("프로그램 종료.");

	}

	// 1. 친구등록
	public static void addFriend() {
		insertFriend();
	}

	// 2. 학교친구
	public static void addUnivFriend() {
		System.out.print("친구이름: ");
		String name = scn.nextLine();
		System.out.print("전화번호: ");
		String pNum = scn.nextLine();
		System.out.print("학교명: ");
		String sch = scn.nextLine();
		System.out.print("전공이름: ");
		String clss = scn.nextLine();
		UnivFriend frnd = new UnivFriend(name, pNum);
		frnd.setSch(sch);
		frnd.setClss(clss);
		for (int i = 0; i < friends.length; i++) {
			if (friends[i] == null) {
				friends[i] = frnd;
				break;
			}
		}
	}

	// 3. 회사친구
	public static void addCompFriend() {
		System.out.print("친구이름: ");
		String name = scn.nextLine();
		System.out.print("전화번호: ");
		String pNum = scn.nextLine();
		System.out.print("회사명: ");
		String com = scn.nextLine();
		System.out.print("부서이름: ");
		String dept = scn.nextLine();
		CompFriend frnd = new CompFriend(name, pNum);
		frnd.setCom(com);
		frnd.setDept(dept);
		for (int i = 0; i < friends.length; i++) {
			if (friends[i] == null) {
				friends[i] = frnd;
				break;
			}
		}
	}

	// 4. 리스트
	public static void showFriendList() {
		for (int i = 0; i < friends.length; i++) {
			if (friends[i] != null) {
				friends[i].showFriendInfo();
			}
		}
	}

	// 5. 조회
	public static void searchFriend() {
		System.out.print("조회> 전화번호를 입력하세요.");
		String pNum = scn.nextLine();
		for (int i = 0; i < friends.length; i++) {
			if (friends[i] != null && pNum.equals(friends[i].getpNum())) {
				friends[i].showFriendInfo();
			}
		}
	}
	
	// 6. 한건 입력
	public static void insertFriend() {
		System.out.print("친구이름: ");
		String name = scn.nextLine();
		System.out.print("전화번호: ");
		String pNum = scn.nextLine();
		Friend frnd = new Friend(name, pNum);
		for (int i = 0; i < friends.length; i++) {
			if (friends[i] == null) {
				friends[i] = frnd;
				break;
			}
		}
	}
}