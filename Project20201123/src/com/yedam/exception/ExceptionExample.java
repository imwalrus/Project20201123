package com.yedam.exception;

import java.sql.Connection;
import java.sql.SQLException;

import com.yedam.common.DAO;

public class ExceptionExample {
	public static void main(String[] args) {
//		int num = "Hello";

		try {
			int[] numbers = new int[3];
			numbers[3] = 10;
		} catch (Exception e) {
			System.out.println("에러 발생");
//			e.printStackTrace();
		}
		try {
			String str = null;
			System.out.println(str.toString());
		} catch (NullPointerException e) {
			System.out.println("출력값이 없음");
		}

		Connection conn = DAO.getConnection();
		try {
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		System.out.println("프로그램 종료");

	}
}
