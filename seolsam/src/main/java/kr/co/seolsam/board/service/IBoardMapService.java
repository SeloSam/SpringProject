package kr.co.seolsam.board.service;

import java.util.List;

import kr.co.seolsam.board.dto.BoardMapDTO;

public interface IBoardMapService {
	public void insertData(BoardMapDTO boardMapDTO);
	public BoardMapDTO view(Integer mapId);
	public void update(BoardMapDTO boardMapDTO);
	public List selectList();
	public List<BoardMapDTO> selectListByTree();
}
