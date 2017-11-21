package kr.co.seolsam.board.service;

import kr.co.seolsam.board.dto.BoardDocDTO;

public interface IBoardDocService {
	public void insertData(BoardDocDTO boardDocDTO);
	public BoardDocDTO view(Integer docId);
	public void update(BoardDocDTO boardDocDTO);
}
