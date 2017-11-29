package kr.co.seolsam.board.controller;


import java.util.List;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import kr.co.seolsam.board.dto.BoardDocDTO;
import kr.co.seolsam.board.dto.BoardMapDTO;
import kr.co.seolsam.board.dto.UserDTO;
import kr.co.seolsam.board.service.IBoardDocService;
import kr.co.seolsam.board.service.IBoardMapService;

@Controller
@RequestMapping("/board/doc")
public class BoardDocController {

	private static final Logger logger = LoggerFactory.getLogger(BoardDocController.class); 
	
	@Autowired	private IBoardMapService boardMapServiceImpl = null;
	@Autowired	private IBoardDocService boardDocServiceImpl = null;
	
	
	
	@RequestMapping(value="/list", method=RequestMethod.GET)
	public void listByPaging(Model model,BoardDocDTO boardDocDTO){
		
		//1. map 정보를 가져온다
		BoardMapDTO mapDTO = boardMapServiceImpl.view(boardDocDTO.getMapId());
		model.addAttribute("map", mapDTO);
		//2.게시판 목록을 가져온다.
		List<BoardDocDTO> list = boardDocServiceImpl.list(boardDocDTO);
		model.addAttribute("list", list);
	}
	
	@RequestMapping(value="/write",method=RequestMethod.GET)
	public void goWrite(BoardDocDTO boardDocDTO, Model model){
		
		BoardMapDTO mapDTO = boardMapServiceImpl.view(boardDocDTO.getMapId());
		model.addAttribute("map", mapDTO);
		
	}
	
	@RequestMapping(value="/doWrite", method=RequestMethod.POST)
	public void doWrite(BoardDocDTO docDTO,HttpSession session) {
		UserDTO userDTO = (UserDTO)session.getAttribute("_user");
		docDTO.setUserId(userDTO.getUserId());
		boardDocServiceImpl.write(docDTO);
	}
	
	
	
}
