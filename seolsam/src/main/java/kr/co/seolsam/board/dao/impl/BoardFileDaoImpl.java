package kr.co.seolsam.board.dao.impl;

import org.springframework.stereotype.Repository;

import kr.co.seolsam.board.dao.IBoardFileDAO;
import kr.co.seolsam.board.dto.BoardFileDTO;
import kr.co.seolsam.common.dao.support.BaseDaoSupport;

@Repository
public class BoardFileDaoImpl extends BaseDaoSupport implements IBoardFileDAO {
	public void insertData(BoardFileDTO BoardFileDTO) {
		getSqlSession().insert("BoardFile.insertData", BoardFileDTO);
	}

	@Override
	public BoardFileDTO selectOne(Integer fileId) {
		return getSqlSession().selectOne("BoardFile.selectOne", fileId);
	}

	@Override
	public void delete(BoardFileDTO boardFileDTO) {
		getSqlSession().delete("BoardFile.delete", boardFileDTO);
		
	}
}
