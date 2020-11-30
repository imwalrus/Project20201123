package com.yedam.board;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.yedam.common.DAO;

public class BoardDAO {
	Connection conn = null;
	PreparedStatement pstmt;
	ResultSet rs;
	String sql;

	// 1) 리스트
	public List getBodList() {
		conn = DAO.getConnection();
		sql = "SELECT * FROM board ORDER BY 1";
		List list = new ArrayList();
		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				BoardVO vo = new BoardVO();
				vo.setBoardNo(rs.getInt("board_no"));
				vo.setTitle(rs.getString("title"));
				vo.setContent(rs.getString("content"));
				vo.setWriter(rs.getString("writer"));
				vo.setDates(rs.getString("creation_date"));
				list.add(vo);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}

	// 2) 상세화면
	public BoardVO getBod(int boardNo) {
		conn = DAO.getConnection();
		sql = "SELECT * FROM board WHERE board_no = ?";
		BoardVO vo = new BoardVO();
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, boardNo);
			rs = pstmt.executeQuery();
			if (rs.next()) {
				vo.setBoardNo(rs.getInt("board_no"));
				vo.setTitle(rs.getString("title"));
				vo.setContent(rs.getString("content"));
				vo.setWriter(rs.getString("writer"));
				vo.setDates(rs.getString("creation_date"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return vo;
	}

	// 3) 등록
	public void insertBod(BoardVO vo) {
		sql = "INSERT INTO board (board_no, title, content, writer, creation_date) VALUES (?, ?, ?, ?, ?)";
		conn = DAO.getConnection();
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, vo.getBoardNo());
			pstmt.setString(2, vo.getTitle());
			pstmt.setString(3, vo.getContent());
			pstmt.setString(4, vo.getWriter());
			pstmt.setString(5, vo.getDates());
			int r = pstmt.executeUpdate();
			System.out.println(r + "건 입력됨.");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	// 4) 삭제
	public void deleteBod(BoardVO vo) {
		sql = "DELETE FROM board WHERE board_no = ?";
		conn = DAO.getConnection();
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, vo.getBoardNo());
			pstmt.executeUpdate();
			System.out.println("삭제 되었습니다.");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (pstmt != null && !pstmt.isClosed())
					pstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	// 5) 수정

}