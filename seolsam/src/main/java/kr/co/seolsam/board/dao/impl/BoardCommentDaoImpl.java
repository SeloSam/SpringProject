package kr.co.seolsam.board.dao.impl;

import org.springframework.stereotype.Repository;

import kr.co.seolsam.board.dao.IBoardCommentDAO;
import kr.co.seolsam.board.dto.BoardCommentDTO;
import kr.co.seolsam.common.dao.support.BaseDaoSupport;
@Repository
public class BoardCommentDaoImpl extends BaseDaoSupport implements IBoardCommentDAO {
	
	public void insertData(BoardCommentDTO boardCommentDTO) {
		getSqlSession().insert("BoardComment.insertData", boardCommentDTO);
	}

	@Override
	public BoardCommentDTO selectOne(Integer commentId) {
		return getSqlSession().selectOne("BoardComment.selectOne", commentId);
	}

	@Override
	public void update(BoardCommentDTO BoardCommentDTO) {
		getSqlSession().update("BoardComment.update", BoardCommentDTO);
	}

		
}
