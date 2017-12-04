package kr.co.seolsam.common.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import kr.co.seolsam.board.dto.UserDTO;
import kr.co.seolsam.board.service.IUserService;

@Controller
@RequestMapping("/find")
public class FindController {
	
	private static final Logger logger = LoggerFactory.getLogger(FindController.class); 

	@Autowired private IUserService userServiceImpl=null;

	@RequestMapping(value="/findid", method=RequestMethod.POST)
	public void findId(UserDTO userDTO) {
		
		logger.debug("findid==>");
	}
	@RequestMapping(value="/findpw", method=RequestMethod.POST)
	public void findPw(UserDTO userDTO) {
		
		logger.debug("findid==>");
	}
}