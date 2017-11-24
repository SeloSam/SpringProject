package kr.co.seolsam.board.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.seolsam.board.dao.IUserDAO;
import kr.co.seolsam.board.dto.UserDTO;
import kr.co.seolsam.board.service.IUserService;
import kr.co.seolsam.common.dto.ResponseDTO;


@Service
public class UserServiceImpl implements IUserService {

	@Autowired private IUserDAO userDaoImpl=null;
	
	@Override
	public void insertData(UserDTO UserDTO) {
		userDaoImpl.insertData(UserDTO);
	}

	@Override
	public UserDTO view(Integer userId) {
		return userDaoImpl.selectOne(userId);
	}

	@Override
	public void update(UserDTO UserDTO) {
		userDaoImpl.update(UserDTO);
	}

	@Override
	public List selectList() {
		return userDaoImpl.selectList();
	}

	@Override
	public UserDTO viewByLgnId(String lgnId) {
		
		
		return userDaoImpl.selectOneByLgnId(lgnId);
	}

	@Override
	public ResponseDTO checkByLgnId(String lgnId) {
		UserDTO user = new UserDTO();
		ResponseDTO res = new ResponseDTO();
		user = userDaoImpl.selectOneByLgnId(lgnId);
		
		if (user == null) {
			res.setCode(0);
			res.setMsg("사용할 수 있는 아이디입니다.");
		} else {
			res.setCode(1);
			res.setMsg("사용할 수 없는 아이디입니다.");
		}
		return res;
	}

	@Override
	public ResponseDTO checkByEmail(String email) {
		UserDTO user = new UserDTO();
		ResponseDTO res = new ResponseDTO();
		user = userDaoImpl.selectOneEmail(email);

		if(user==null) {
			res.setCode(0);
			res.setMsg("사용할 수 있는 이메일");
		}else {
			res.setCode(1);
			res.setMsg("사용할 수 없는 이메일");
		}
		return res;
	}

}
