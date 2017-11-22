package kr.co.seolsam.common.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import kr.co.seolsam.board.dao.IUserDAO;
import kr.co.seolsam.board.dto.UserDTO;

@Controller
@RequestMapping("/join")
public class UserController {
	
	private static final Logger logger = LoggerFactory.getLogger(UserController.class); 

	@Autowired private IUserDAO userDaoImpl=null;
	
	@RequestMapping(method = RequestMethod.GET)
	public void goJoin() {
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public void doJoin(UserDTO userDTO) {
		logger.debug("print==>"+userDTO.toString());
		
		userDTO.setRole("user");		
		userDTO.setStatus(9);

		userDaoImpl.insertData(userDTO);
	}
}