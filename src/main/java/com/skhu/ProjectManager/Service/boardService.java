package com.skhu.ProjectManager.Service;

import java.util.List;

import com.skhu.ProjectManager.VO.boardVO;

public interface boardService {
	public List<boardVO> boardList() throws Exception;
	public int insertBoard(boardVO VO);
	public boardVO getBoardDetail(int board_no);
	public int delBoard(int board_no);

}
