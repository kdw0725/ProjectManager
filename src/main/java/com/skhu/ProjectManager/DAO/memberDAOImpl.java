package com.skhu.ProjectManager.DAO;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.skhu.ProjectManager.VO.memberVO;



@Repository
public class memberDAOImpl implements memberDAO{
	private static final String namespace="com.skhu.ProjectManager.memberMapper";
	
	@Autowired
	private SqlSession sqlSession;

	@Override
	public int insertMember(memberVO VO) {
		return sqlSession.insert(namespace+".insertMember",VO);
	}

}
