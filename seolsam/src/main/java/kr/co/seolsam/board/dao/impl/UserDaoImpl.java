package kr.co.seolsam.board.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import kr.co.seolsam.board.dao.IUserDAO;
import kr.co.seolsam.board.dto.UserDTO;
import kr.co.seolsam.common.dao.support.BaseDaoSupport;
import kr.co.seolsam.common.dto.ResponseDTO;
@Repository
public class UserDaoImpl extends BaseDaoSupport implements IUserDAO {
	public void insertData(UserDTO UserDTO) {
		getSqlSession().insert("User.insertData", UserDTO);
	}

	@Override
	public UserDTO selectOne(Integer userId) {
		return getSqlSession().selectOne("User.selectOne", userId);
	}

	@Override
	public void update(UserDTO UserDTO) {
		getSqlSession().update("User.update", UserDTO);
		
	}

	@Override
	public List selectList() {
		return getSqlSession().selectList("User.selectList");
	}

	@Override
	public UserDTO selectOneByLgnId(String lgnId) {
		return getSqlSession().selectOne("User.selectOneByLgnId", lgnId);
	}

	@Override
	public UserDTO checkByLgnId(String lgnId) {
		return getSqlSession().selectOne("User.selectOneByLgnId", lgnId);
	}

	
	@Override
	public UserDTO selectOneEmail(String email) {
		return getSqlSession().selectOne("User.selectOneEmail", email);
	}

}
