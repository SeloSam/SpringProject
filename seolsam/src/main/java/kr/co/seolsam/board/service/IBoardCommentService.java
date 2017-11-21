package kr.co.seolsam.board.service;

import kr.co.seolsam.board.dto.BoardCommentDTO;

public interface IBoardCommentService {
	public void insertData(BoardCommentDTO boardCommentDTO);
	public BoardCommentDTO view(Integer commentId);
	public void update(BoardCommentDTO boardCommentDTO);
}
