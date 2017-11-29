package kr.co.seolsam.board.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import kr.co.seolsam.board.dao.IBoardDocDAO;
import kr.co.seolsam.board.dto.BoardDocDTO;
import kr.co.seolsam.common.dao.support.BaseDaoSupport;

@Repository
public class BoardDocDaoImpl extends BaseDaoSupport implements IBoardDocDAO {
	public void insertData(BoardDocDTO boardDocDTO) {
		getSqlSession().insert("BoardDoc.insertData", boardDocDTO);
	}

	@Override
	public BoardDocDTO selectOne(Integer docId) {
		return getSqlSession().selectOne("BoardDoc.selectOne", docId);
	}

	@Override
	public void update(BoardDocDTO boardDocDTO) {
		getSqlSession().update("BoardDoc.update", boardDocDTO);
	}

	@Override
	public List<BoardDocDTO> selectListByPaging(BoardDocDTO boardDocDTO) {
		return getSqlSession().selectList("BoardDoc.selectListByPaging", boardDocDTO);
	}
}
