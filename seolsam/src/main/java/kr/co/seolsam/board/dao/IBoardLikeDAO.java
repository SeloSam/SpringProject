package kr.co.seolsam.board.dao;

import org.springframework.stereotype.Repository;

import kr.co.seolsam.board.dto.BoardLikeDTO;

@Repository
public interface IBoardLikeDAO {
	public void insertData(BoardLikeDTO BoardLikeDTO);
	public BoardLikeDTO selectOne(Integer userId);
}
