package com.yedam.board;

public class BoardVO {
	private int boardNo;
	private String title;
	private String content;
	private String writer;
	private String dates;

	public BoardVO() {

	}

	public BoardVO(int boardNo, String title, String content, String writer, String dates) {
		super();
		this.boardNo = boardNo;
		this.title = title;
		this.content = content;
		this.writer = writer;
		this.dates = dates;
	}

	public int getBoardNo() {
		return boardNo;
	}

	public void setBoardNo(int boardNo) {
		this.boardNo = boardNo;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public String getDates() {
		return dates;
	}

	public void setDates(String dates) {
		this.dates = dates;
	}
	public void showBodInfo() {
		System.out.println("글번호: " + boardNo + ", 제목: " + title + ", 작성자: " + writer + ", 작성일자: " + dates);
	}
	
	public void showBodInfo1() {
		System.out.println("글번호: " + boardNo + ", 제목: " + title + ", 작성자: " + writer + ", 내용: " + content + ", 작성일자: " + dates);
	}
}
