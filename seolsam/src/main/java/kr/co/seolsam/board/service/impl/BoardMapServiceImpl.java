package kr.co.seolsam.board.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.seolsam.board.dao.IBoardMapDAO;
import kr.co.seolsam.board.dto.BoardMapDTO;
import kr.co.seolsam.board.service.IBoardMapService;

@Service
public class BoardMapServiceImpl implements IBoardMapService {
	
	@Autowired private IBoardMapDAO BoardMapDAOImpl=null;
	
	
	@Override
	public void insertData(BoardMapDTO boardMapDTO) {
		BoardMapDAOImpl.insertData(boardMapDTO);
	}

	@Override
	public BoardMapDTO view(Integer mapId) {
		return BoardMapDAOImpl.selectOne(mapId);
		
	}

	@Override
	public void update(BoardMapDTO boardMapDTO) {
		BoardMapDAOImpl.update(boardMapDTO);
	}

	@Override
	public List selectList() {
		return BoardMapDAOImpl.selectList();
	}

	/*@Override
	public void delete(BoardMapDTO boardMapDTO) {
		BoardMapDAOImpl.delete(boardMapDTO);
	}*/
}
