package com.yedam.board;

import java.util.List;
import java.util.Scanner;

public class BoardMain {
	public static void main(String[] args) {
		// 1) 리스트 2) 상세화면 3) 등록 4) 삭제
		Scanner scn = new Scanner(System.in);
		BoardService service = new BoardServicelmpl();

		while (true) {
			System.out.println("------------------------------------------------");
			System.out.println("1) 리스트 2) 상세화면 3) 등록 4) 삭제");
			System.out.println("------------------------------------------------");
			System.out.print("선택> ");
			int selectNo = scn.nextInt();
			if (selectNo == 1) {
				List list = service.getBodList();
				for (Object vo : list) {
					BoardVO bod = (BoardVO) vo;
					bod.showBodInfo();
				}
			} else if (selectNo == 2) {
				System.out.println("조회할 글번호 입력> ");
				int boardNo = scn.nextInt();
				BoardVO vo = service.getBod(boardNo);
				vo.showBodInfo1();

			} else if (selectNo == 3) {
				System.out.println("글번호 입력> ");
				int boardNo = scn.nextInt();
				scn.nextLine();
				System.out.println("글제목 입력> ");
				String title = scn.nextLine();
				System.out.println("작성자 입력> ");
				String writer = scn.nextLine();
				System.out.println("글내용 입력> ");
				String content = scn.nextLine();
				System.out.println("작성일자 입력(YYYY-MM-DD)> ");
				String dates = scn.nextLine();

				BoardVO vo = new BoardVO();
				vo.setBoardNo(boardNo);
				vo.setTitle(title);
				vo.setWriter(writer);
				vo.setContent(content);
				vo.setDates(dates);

				service.insertBod(vo);

			} else if (selectNo == 4) {
				System.out.println("삭제할 글번호를 입력> ");
				int boardNo = scn.nextInt();
				scn.nextLine();

				BoardVO vo = new BoardVO();
				vo.setBoardNo(boardNo);

				service.deleteBod(vo);

			}
		}
	}
}
