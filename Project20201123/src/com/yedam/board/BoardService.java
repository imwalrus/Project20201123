package com.yedam.board;

import java.util.List;

public interface BoardService {

	public List getBodList();
	
	public BoardVO getBod(int bodNo);
	
	public void insertBod(BoardVO bodVo);
	
	public void deleteBod(BoardVO bodVo);
	
}
