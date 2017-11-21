package kr.co.seolsam.board.dao;

import org.springframework.stereotype.Repository;

import kr.co.seolsam.board.dto.BoardCommentDTO;

@Repository
public interface IBoardCommentDAO {
	public void insertData(BoardCommentDTO BoardCommentDTO);
	public BoardCommentDTO selectOne(Integer commentId);
	public void update(BoardCommentDTO BoardCommentDTO);
}
