package com.yedam.board;

import java.util.List;

public class BoardServicelmpl implements BoardService {

	BoardDAO dao = new BoardDAO();

	@Override
	public List getBodList() {
		return dao.getBodList();
	}

	@Override
	public BoardVO getBod(int boardNo) {
		return dao.getBod(boardNo);
	}

	@Override
	public void insertBod(BoardVO bodVo) {
		dao.insertBod(bodVo);
	}

	@Override
	public void deleteBod(BoardVO bodVo) {
		dao.deleteBod(bodVo);
	}
	
}
