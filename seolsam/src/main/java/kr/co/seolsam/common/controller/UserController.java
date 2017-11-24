package kr.co.seolsam.common.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import kr.co.seolsam.board.dao.IUserDAO;
import kr.co.seolsam.board.dto.UserDTO;
import kr.co.seolsam.board.service.IUserService;
import kr.co.seolsam.common.dto.ResponseDTO;

@Controller
@RequestMapping("/join")
public class UserController {
	
	private static final Logger logger = LoggerFactory.getLogger(UserController.class); 

	@Autowired private IUserService userServiceImpl=null;
	
	
	
	@RequestMapping(method = RequestMethod.GET)
	public void goJoin() {
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public void doJoin(UserDTO userDTO) {
		logger.debug("print==>"+userDTO.toString());
		
		userDTO.setRole("user");		
		userDTO.setStatus(9);

		userServiceImpl.insertData(userDTO);
	}
	
	
	
	@ResponseBody
	@RequestMapping(value="/checkLgnId", method = RequestMethod.POST)
	public ResponseDTO checkLgnId(@RequestParam(value="id", required=true) String lgnId) {
		ResponseDTO res = null;
		try {
			res=userServiceImpl.checkByLgnId(lgnId);
		} catch (Exception e) {
			e.printStackTrace();
			logger.error("ERROR==>" + e.getMessage());
			
			res = new ResponseDTO();
			
			res.setCode(-1);
			res.setMsg("오류가 발생했습니다. 관리자에게 문의하세요");
		}
		return res;
	}

	@ResponseBody
	@RequestMapping(value="/checkEmail", method = RequestMethod.POST)
	public ResponseDTO checkEmail(@RequestParam(value="email", required=true) String email) {
		ResponseDTO res = null;
		try {
			res=userServiceImpl.checkByEmail(email);
		} catch (Exception e) {
			e.printStackTrace();
			logger.error("ERROR==>" + e.getMessage());
			
			res = new ResponseDTO();
			
			res.setCode(-1);
			res.setMsg("오류가 발생했습니다. 관리자에게 문의하세요");
		}
		return res;
	}
	
}