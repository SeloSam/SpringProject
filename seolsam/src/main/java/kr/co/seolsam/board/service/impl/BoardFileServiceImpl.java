package kr.co.seolsam.board.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.seolsam.board.dao.IBoardFileDAO;
import kr.co.seolsam.board.dto.BoardFileDTO;
import kr.co.seolsam.board.service.IBoardFileService;

@Service
public class BoardFileServiceImpl implements IBoardFileService {

	@Autowired private IBoardFileDAO BoardFileDaoImpl=null;
	
	@Override
	public void insertData(BoardFileDTO BoardFileDTO) {
		BoardFileDaoImpl.insertData(BoardFileDTO);
	}

	@Override
	public BoardFileDTO view(Integer fileId) {
		return BoardFileDaoImpl.selectOne(fileId);
	}

	@Override
	public void delete(BoardFileDTO boardFileDTO) {
		BoardFileDaoImpl.delete(boardFileDTO);
		
	}
		
}
