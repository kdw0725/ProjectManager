package com.skhu.ProjectManager.Controller;

import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.skhu.ProjectManager.Service.memberService;

@Controller
public class memberController {
	@Autowired
	memberService service;
	
	@RequestMapping(value = "/logIn", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {				
		return "/member/logIn";
	}
	
	@RequestMapping(value = "/signIn", method = RequestMethod.GET)
	public String signIn(Locale locale, Model model) {				
		return "/member/signIn";
	}
}
