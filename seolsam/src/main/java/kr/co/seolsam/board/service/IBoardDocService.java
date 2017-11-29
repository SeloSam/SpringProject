package kr.co.seolsam.board.service;

import java.util.List;

import kr.co.seolsam.board.dto.BoardDocDTO;

public interface IBoardDocService {
	public void insertData(BoardDocDTO boardDocDTO);
	
	public void write(BoardDocDTO boardDocDTO);
	
	public BoardDocDTO view(Integer docId);
	public void update(BoardDocDTO boardDocDTO);
	public List<BoardDocDTO> list(BoardDocDTO boardDocDTO);
}
