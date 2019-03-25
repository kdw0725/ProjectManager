package com.skhu.ProjectManager.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.skhu.ProjectManager.DAO.memberDAO;
import com.skhu.ProjectManager.VO.memberVO;

@Service
public class memberServiceImpl implements memberService{
	@Autowired
	private memberDAO dao;

	@Override
	public int insertMember(memberVO VO) {
		return dao.insertMember(VO);
	}



}
