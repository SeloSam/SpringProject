package kr.co.seolsam.board.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import kr.co.seolsam.board.dto.BoardDocDTO;
import kr.co.seolsam.board.service.IBoardDocService;

@Controller
@RequestMapping("/board/doc")
public class BoardDocController {

	@Autowired
	private IBoardDocService boardDocserviceImpl = null;
	
	@RequestMapping(value="/list", method=RequestMethod.GET)
	public void listByPaging(Model model,BoardDocDTO boardDocDTO){
		List<BoardDocDTO> list = boardDocserviceImpl.list(boardDocDTO);
		model.addAttribute("list", list);
	}
	
}
