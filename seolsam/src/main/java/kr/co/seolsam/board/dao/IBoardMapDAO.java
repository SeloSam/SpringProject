package kr.co.seolsam.board.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import kr.co.seolsam.board.dto.BoardMapDTO;

@Repository
public interface IBoardMapDAO {
	public void insertData(BoardMapDTO boardMapDTO);
	public BoardMapDTO selectOne(Integer mapId);
	public void update(BoardMapDTO boardMapDTO);
	/*public void delete(BoardMapDTO boardMapDTO);*/
	public List selectList();
	public List<BoardMapDTO> selectListByTree();
}
