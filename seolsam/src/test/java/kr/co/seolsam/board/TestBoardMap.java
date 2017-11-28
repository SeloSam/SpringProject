package kr.co.seolsam.board;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import kr.co.seolsam.board.dto.BoardMapDTO;
import kr.co.seolsam.board.service.IBoardMapService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={
 "file:src/main/webapp/WEB-INF/spring/appServlet/servlet-context.xml",
 "file:src/main/webapp/WEB-INF/spring/root-context.xml"}
)

public class TestBoardMap {
	private static final Logger logger = LoggerFactory.getLogger(TestBoardMap.class);
	
	@Autowired private IBoardMapService BoardMapServiceImpl = null;
	
	@Test
	public void write() {
		logger.debug("map==>"+"map");
		
		BoardMapDTO map=new BoardMapDTO();

		map.setMapName("nn");
		map.setMapType("N");
		map.setFileYn("N");
		map.setCommentYn("N");
		map.setDelYn("N");
		map.setParMapId(1);
		map.setBoardOreder(1);
		
		BoardMapServiceImpl.insertData(map);
	}
	
	@Test
	public void view() {
		BoardMapDTO map = BoardMapServiceImpl.view(1);
		logger.debug("mapid====>" +map.toString());
	}
	
	
	@Test
	public void edit() {
		logger.debug("mapEdit==>"+"edit");
		
		BoardMapDTO map=new BoardMapDTO();
		
		map.setMapId(1);
		
		map.setMapName("mmm");
		map.setBoardOreder(3);
		map.setMapType("Y");
		
		BoardMapServiceImpl.update(map);
	}
	
	
	
	@Test
	public void list() {
		List<BoardMapDTO> selectList = BoardMapServiceImpl.selectList();
		for (BoardMapDTO boardMapDTO : selectList) {
			logger.debug("SelectList==>" + boardMapDTO.toString());
		}
		
	}
	
	@Test
	public void selectListByTree() {
		List<BoardMapDTO> maplist = BoardMapServiceImpl.selectListByTree();
		for (BoardMapDTO boardMapDTO : maplist) {
			logger.debug("SelectList==>" + boardMapDTO.toString());
		}
	}
	
	/*@Test
	public void remove() {
		logger.debug("mapRemove==>"+"Remove");
		
		BoardMapDTO map = new BoardMapDTO();
		
		map.setMapId(1);
		
		BoardMapServiceImpl.delete(map);
		
	}*/
}
