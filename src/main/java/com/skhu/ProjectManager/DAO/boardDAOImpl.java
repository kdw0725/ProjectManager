package com.skhu.ProjectManager.DAO;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.skhu.ProjectManager.VO.boardVO;

@Repository
public class boardDAOImpl implements boardDAO{
	private static final String namespace="com.skhu.ProjectManager.boardMapper";
	
	@Autowired
	private SqlSession sqlSession;

	@Override
	public List<boardVO> boardList() throws Exception {
		return sqlSession.selectList(namespace+".boardList");
	}

	@Override
	public int insertBoard(boardVO VO) {
		return sqlSession.insert(namespace+".insertBoard", VO);
	}

	@Override
	public boardVO getBoardDetail(int board_no) {
		return sqlSession.selectOne(namespace+".getBoardDetail",board_no);
	}

	@Override
	public int delBoard(int board_no) {
		return sqlSession.delete(namespace+".delBoard", board_no);
	}

	@Override
	public int updateBoard(boardVO VO) {
		return sqlSession.update(namespace+".updateBoard",VO);
	}

	

	
}
