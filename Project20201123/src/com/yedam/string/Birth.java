package com.yedam.string;

public class Birth {
	public static void main(String[] args) {

		String birth1 = "991123-1234567";
		String birth2 = "991122_2345678";
		String birth3 = "010101*3123456";
		String birth4 = "0202024211234";

		char sex = birth1.charAt(7);
		switch (sex) {
		case '1':
		case '3':
			System.out.println("남자입니다");
			break;
		case '2':
		case '4':
			System.out.println("여자입니다");
			break;
		}
		char sex2 = birth2.charAt(7);
		switch (sex2) {
		case '1':
		case '3':
			System.out.println("남자입니다");
			break;
		case '2':
		case '4':
			System.out.println("여자입니다");
			break;
		}
		char sex3 = birth3.charAt(7);
		switch (sex3) {
		case '1':
		case '3':
			System.out.println("남자입니다");
			break;
		case '2':
		case '4':
			System.out.println("여자입니다");
			break;
		}
		char sex4 = birth4.charAt(6);
		switch (sex4) {
		case '1':
		case '3':
			System.out.println("남자입니다");
			break;
		case '2':
		case '4':
			System.out.println("여자입니다");
			break;
		}
	}
}