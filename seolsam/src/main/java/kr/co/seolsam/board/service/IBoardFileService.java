package kr.co.seolsam.board.service;

import kr.co.seolsam.board.dto.BoardFileDTO;

public interface IBoardFileService {
	public void insertData(BoardFileDTO boardFileDTO);
	public BoardFileDTO view(Integer fileId);
	public void delete(BoardFileDTO boardFileDTO);
}
