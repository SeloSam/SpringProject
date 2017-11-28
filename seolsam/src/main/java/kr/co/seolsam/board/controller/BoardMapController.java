package kr.co.seolsam.board.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import kr.co.seolsam.board.dto.BoardMapDTO;
import kr.co.seolsam.board.service.IBoardMapService;

@Controller
@RequestMapping("/board/map")
public class BoardMapController {

	@Autowired
	private IBoardMapService boardMapServiceImpl = null;

	@ResponseBody
	@RequestMapping(value = "/listByTree", method = RequestMethod.GET)
	public List<BoardMapDTO> listByTree() {
		return boardMapServiceImpl.selectListByTree();
	}
}