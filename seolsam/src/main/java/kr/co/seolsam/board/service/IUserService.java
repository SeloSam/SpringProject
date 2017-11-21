package kr.co.seolsam.board.service;

import java.util.List;

import kr.co.seolsam.board.dto.UserDTO;

public interface IUserService {
	public void insertData(UserDTO UserDTO);
	public UserDTO view(Integer userId);
	public UserDTO viewByLgnId(String lgnId);
	public void update(UserDTO UserDTO);
	public List selectList();
}
