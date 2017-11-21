package kr.co.seolsam.board.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import kr.co.seolsam.board.dao.IBoardMapDAO;
import kr.co.seolsam.board.dto.BoardMapDTO;
import kr.co.seolsam.common.dao.support.BaseDaoSupport;
@Repository
public class BoardMapDaoImpl extends BaseDaoSupport implements IBoardMapDAO {

	public void insertData(BoardMapDTO boardMapDTO) {
		getSqlSession().insert("BoardMap.insertData", boardMapDTO);
	}

	@Override
	public BoardMapDTO selectOne(Integer mapId) {
		return getSqlSession().selectOne("BoardMap.selectOne", mapId);
	}

	@Override
	public void update(BoardMapDTO boardMapDTO) {
		getSqlSession().update("BoardMap.update", boardMapDTO);
	}

	@Override
	public List selectList() {
		return getSqlSession().selectList("BoardMap.selectList");
	}



	/*@Override
	public void delete(BoardMapDTO boardMapDTO) {
		getSqlSession().delete("BoardMap.delete", boardMapDTO);
	}*/

	
}
