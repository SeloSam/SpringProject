package kr.co.seolsam.board.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.seolsam.board.dao.IBoardCommentDAO;
import kr.co.seolsam.board.dto.BoardCommentDTO;
import kr.co.seolsam.board.service.IBoardCommentService;


@Service
public class BoardCommentServiceImpl implements IBoardCommentService {

	@Autowired private IBoardCommentDAO BoardCommentDaoImpl=null;
	
	@Override
	public void insertData(BoardCommentDTO boardCommentDTO) {
		BoardCommentDaoImpl.insertData(boardCommentDTO);
	}

	@Override
	public BoardCommentDTO view(Integer commentId) {
		return BoardCommentDaoImpl.selectOne(commentId);
	}

	@Override
	public void update(BoardCommentDTO boardCommentDTO) {
		BoardCommentDaoImpl.update(boardCommentDTO);
	}

	
}
