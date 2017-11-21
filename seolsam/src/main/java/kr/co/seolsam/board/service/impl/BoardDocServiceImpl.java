package kr.co.seolsam.board.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.seolsam.board.dao.IBoardDocDAO;
import kr.co.seolsam.board.dto.BoardDocDTO;
import kr.co.seolsam.board.service.IBoardDocService;

@Service
public class BoardDocServiceImpl implements IBoardDocService {

	@Autowired private IBoardDocDAO BoardDocDaoImpl=null;
	
	@Override
	public void insertData(BoardDocDTO boardDocDTO) {
		BoardDocDaoImpl.insertData(boardDocDTO);
	}

	@Override
	public BoardDocDTO view(Integer docId) {
		return BoardDocDaoImpl.selectOne(docId);
	}

	@Override
	public void update(BoardDocDTO boardDocDTO) {
		BoardDocDaoImpl.update(boardDocDTO);
	}
		
}
