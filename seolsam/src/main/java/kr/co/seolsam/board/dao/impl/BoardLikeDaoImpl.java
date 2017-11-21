package kr.co.seolsam.board.dao.impl;

import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.stereotype.Repository;

import kr.co.seolsam.board.dao.IBoardLikeDAO;
import kr.co.seolsam.board.dto.BoardLikeDTO;
import kr.co.seolsam.common.dao.support.BaseDaoSupport;


@Repository
public class BoardLikeDaoImpl extends BaseDaoSupport implements IBoardLikeDAO {
	public void insertData(BoardLikeDTO boardLikeDTO) {
		getSqlSession().insert("BoardLike.insertData", boardLikeDTO);
	}

	@Override
	public BoardLikeDTO selectOne(Integer userId) {
		return getSqlSession().selectOne("BoardLike.selectOne", userId);
	}
}
