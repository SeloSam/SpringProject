package kr.co.seolsam.board.controller;


import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import kr.co.seolsam.board.dto.BoardDocDTO;
import kr.co.seolsam.board.dto.BoardMapDTO;
import kr.co.seolsam.board.dto.BoardSearchDTO;
import kr.co.seolsam.board.dto.UserDTO;
import kr.co.seolsam.board.service.IBoardDocService;
import kr.co.seolsam.board.service.IBoardMapService;

@Controller
@RequestMapping("/board/doc")
public class BoardDocController {
	
	@Autowired	private IBoardMapService boardMapServiceImpl = null;
	@Autowired	private IBoardDocService boardDocServiceImpl = null;
	
	@RequestMapping(value="/list", method=RequestMethod.GET)
	public void listByPaging(Model model, @ModelAttribute("search") BoardSearchDTO search){
				
		//1. map 정보를 가져온다
		BoardMapDTO mapDTO = boardMapServiceImpl.view(search.getMapId());
		model.addAttribute("map", mapDTO);
		
		//## 게시판 총 갯수를 가져온다.
		search.setRows(3);
		int total = boardDocServiceImpl.count(search);
		search.setTotal(total);
		
		//## 게시판 목록을 가져온다.
		List<BoardDocDTO> list = boardDocServiceImpl.list(search);
		model.addAttribute("list", list);
	}
	
	@RequestMapping(value="/write",method=RequestMethod.GET)
	public void goWrite(BoardDocDTO boardDocDTO, Model model){
		
		BoardMapDTO mapDTO = boardMapServiceImpl.view(boardDocDTO.getMapId());
		model.addAttribute("map", mapDTO);
	}
	
	@RequestMapping(value="/doWrite", method=RequestMethod.POST)
	public String doWrite(Model model, BoardDocDTO docDTO, HttpSession session) {
		
		UserDTO userDTO = (UserDTO)session.getAttribute("_user");
		
		BoardMapDTO mapDTO = boardMapServiceImpl.view(docDTO.getMapId());
		model.addAttribute("map", mapDTO);
		
		docDTO.setUserId(userDTO.getUserId());
		boardDocServiceImpl.insertData(docDTO);
		
		
		return "/board/doc/list";
	}
}
