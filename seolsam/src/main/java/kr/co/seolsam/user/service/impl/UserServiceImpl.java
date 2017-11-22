package kr.co.seolsam.user.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.seolsam.user.dao.IUserDAO;
import kr.co.seolsam.user.dto.UserDTO;
import kr.co.seolsam.user.service.IUserService;


@Service
public class UserServiceImpl implements IUserService {

	@Autowired private IUserDAO UserDaoImpl=null;
	
	@Override
	public void insertData(UserDTO UserDTO) {
		UserDaoImpl.insertData(UserDTO);
	}

	@Override
	public UserDTO view(Integer userId) {
		return UserDaoImpl.selectOne(userId);
	}

	@Override
	public void update(UserDTO UserDTO) {
		UserDaoImpl.update(UserDTO);
	}

	@Override
	public List selectList() {
		return UserDaoImpl.selectList();
	}

	@Override
	public UserDTO viewByLgnId(String lgnId) {
		return null;
	}
}
