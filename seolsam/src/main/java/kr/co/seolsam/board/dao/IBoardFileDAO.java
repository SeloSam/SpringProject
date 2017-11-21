package kr.co.seolsam.board.dao;

import kr.co.seolsam.board.dto.BoardFileDTO;

public interface IBoardFileDAO {
	public void insertData(BoardFileDTO BoardFileDTO);
	public BoardFileDTO selectOne(Integer fileId);
	public void delete(BoardFileDTO boardFileDTO);
}
