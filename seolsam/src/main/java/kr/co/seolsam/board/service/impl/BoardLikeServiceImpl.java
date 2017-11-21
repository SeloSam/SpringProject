package kr.co.seolsam.board.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.seolsam.board.dao.IBoardLikeDAO;
import kr.co.seolsam.board.dto.BoardLikeDTO;
import kr.co.seolsam.board.service.IBoardLikeService;


@Service
public class BoardLikeServiceImpl implements IBoardLikeService {

	@Autowired private IBoardLikeDAO BoardLikeDaoImpl=null;
	
	@Override
	public void insertData(BoardLikeDTO boardLikeDTO) {
		BoardLikeDaoImpl.insertData(boardLikeDTO);
	}

	@Override
	public BoardLikeDTO view(Integer userId) {
		return BoardLikeDaoImpl.selectOne(userId);
	}

		
}
