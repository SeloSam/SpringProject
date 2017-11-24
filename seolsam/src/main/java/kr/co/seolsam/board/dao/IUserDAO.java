package kr.co.seolsam.board.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import kr.co.seolsam.board.dto.UserDTO;
@Repository
public interface IUserDAO {
	public void insertData(UserDTO UserDTO);
	public UserDTO selectOne(Integer userId);
	public void update(UserDTO UserDTO);
	public UserDTO selectOneByLgnId(String lgnId);
	public List selectList();
	
	public UserDTO checkByLgnId(String lgnId);
	public UserDTO selectOneEmail(String email);
}
