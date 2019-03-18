package com.skhu.ProjectManager.Controller;

import java.util.List;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.skhu.ProjectManager.Service.boardService;
import com.skhu.ProjectManager.VO.boardVO;

/**
 * Handles requests for the application home page.
 */
@Controller
public class boardController {
	@Autowired
	boardService service;
	
	private static final Logger logger = LoggerFactory.getLogger(boardController.class);
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
				
		return "home";
	}
	
	@RequestMapping(value = "/boardList", method = RequestMethod.GET)
	public String boardList(Model model)throws Exception{
		List<boardVO> list;
		list = service.boardList();
		model.addAttribute("list", list);
		return "/board/boardList";
		
	
		
	}

	@RequestMapping(value="/boardInsert", method = RequestMethod.GET)
	public String boardInsert() {
		return "/board/boardInsert";
	}
	
	@RequestMapping(value="/boardInsertPage", method = RequestMethod.GET)
	public String boardInsertDO(boardVO vo,
			@RequestParam("board_writer") String board_writer,
			@RequestParam("board_title") String board_title,
			@RequestParam("board_content") String board_content) {
		vo.setBoard_writer(board_writer);
		vo.setBoard_title(board_title);
		vo.setBoard_content(board_content);
		service.insertBoard(vo);

		return "redirect:/boardList";
	}
	
	@RequestMapping(value="/boardDetail", method = RequestMethod.GET)
	public String boardDetail(Model model, HttpServletRequest req) {
		String no = req.getParameter("board_no");
		boardVO VO = service.getBoardDetail(Integer.parseInt(no));
		model.addAttribute("VO",VO);
		System.out.println(VO.getBoard_insertdate());
		return "/board/boardDetail";
	}

	
}
