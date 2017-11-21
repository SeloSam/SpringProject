package kr.co.seolsam.board.dao;

import kr.co.seolsam.board.dto.BoardDocDTO;

public interface IBoardDocDAO {
	public void insertData(BoardDocDTO boardDocDTO);
	public BoardDocDTO selectOne(Integer docId);
	public void update(BoardDocDTO boardDocDTO);
}
