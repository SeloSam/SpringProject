package kr.co.seolsam.board.dao;

import java.util.List;

import kr.co.seolsam.board.dto.BoardDocDTO;

public interface IBoardDocDAO {
	public void insertData(BoardDocDTO boardDocDTO);
	public void insert(BoardDocDTO boardDocDTO);
	public BoardDocDTO selectOne(Integer docId);
	public void update(BoardDocDTO boardDocDTO);
	public List<BoardDocDTO> selectListByPaging(BoardDocDTO boardDocDTO);
}
