package kr.co.seolsam.board.service;

import org.springframework.stereotype.Repository;

import kr.co.seolsam.board.dto.BoardLikeDTO;

@Repository
public interface IBoardLikeService {
	public void insertData(BoardLikeDTO boardLikeDTO);
	public BoardLikeDTO view(Integer userId);
}
