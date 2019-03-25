package com.skhu.ProjectManager.Controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.skhu.ProjectManager.Service.memberService;
import com.skhu.ProjectManager.VO.memberVO;

@Controller
public class memberController {
	@Autowired
	memberService service;
	
	@RequestMapping(value = "/logIn", method = RequestMethod.GET)
	public String home(Model model) {				
		return "/member/logIn";
	}
	
	@RequestMapping(value = "/signIn", method = RequestMethod.GET)
	public String signIn(Model model) {				
		return "/member/signIn";
	}
	
	@RequestMapping(value="/signInPage", method = RequestMethod.GET)
	public String signInPage(Model model,
			@RequestParam Map<String, String> param,
			memberVO VO
			) {
//		System.out.println(param.get("member_name"));
//		System.out.println(param.get("member_id"));
//		System.out.println(param.get("member_pw"));
//		System.out.println(param.get("member_email"));
//		System.out.println(param.get("member_pnum"));

		VO.setMember_name(param.get("member_name"));
		VO.setMember_id(param.get("member_id"));
		VO.setMember_pw(param.get("member_pw"));
		VO.setMember_email(param.get("member_email"));
		VO.setMember_pnum(param.get("member_pnum"));
		service.insertMember(VO);
		
		return "redirect:/";
	}
	
	@RequestMapping(value = "/idOverlap", method = RequestMethod.GET)
	public String isIdin(Model model) {
		return "/member/signIn";
	}
}
