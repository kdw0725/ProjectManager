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
		return "/board/boardDetail";
	}
	
	@RequestMapping(value="/boardDelete", method = RequestMethod.GET)
	public String boardDelete(Model model, HttpServletRequest req) {
		String no = req.getParameter("board_no");
		int num = service.delBoard(Integer.parseInt(no));
		model.addAttribute("num",num);
		return "redirect:/boardList";
	}
	
	@RequestMapping(value="/boardUpdate", method = RequestMethod.GET)
	public String updateBoard(Model model, HttpServletRequest req, boardVO VO) {
		String no = req.getParameter("board_no");
		VO = service.getBoardDetail(Integer.parseInt(no));
		model.addAttribute("VO",VO);
		return "/board/boardUpdate";
	}
	
	@RequestMapping(value="/boardUpdatePage", method = RequestMethod.GET)
	public String boardUpdatePage(Model model, boardVO VO,
			@RequestParam("board_title") String board_title,
			@RequestParam("board_writer") String board_writer,
			@RequestParam("board_content") String board_content) {		
		VO.setBoard_title(board_title); 
		VO.setBoard_writer(board_writer);
		VO.setBoard_content(board_content);
		service.updateBoard(VO);
		return "redirect:/boardList";
	}

	
}
