package kr.co.seolsam.board;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import kr.co.seolsam.board.dto.BoardDocDTO;
import kr.co.seolsam.board.dto.BoardSearchDTO;
import kr.co.seolsam.board.service.IBoardDocService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={
 "file:src/main/webapp/WEB-INF/spring/appServlet/servlet-context.xml",
 "file:src/main/webapp/WEB-INF/spring/root-context.xml"}
)
public class TestBoardDoc {
	private static final Logger logger = LoggerFactory.getLogger(TestBoardDoc.class);
	
	@Autowired private IBoardDocService boardDocServiceImpl=null;
	
	@Test
	public void write() {
		logger.debug("doc==>"+"doc");
		
		BoardDocDTO doc = new BoardDocDTO();
		doc.setTitle("asdfasdfasdff");
		doc.setUserId(1);
		doc.setMapId(1);
		doc.setCntRead(2);
		doc.setBoardContents("a");
		
		boardDocServiceImpl.insertData(doc);
	}
	
	@Test
	public void view() {
		BoardDocDTO doc = boardDocServiceImpl.view(1);
		logger.debug("docId==>"+doc.toString());
	}
	@Test
	public void edit() {
		logger.debug("docEdit==>"+"docEdit");
		
		BoardDocDTO doc = new BoardDocDTO();
		
		doc.setTitle("aaaaaaaaaaaa");
		doc.setBoardContents("b");
		doc.setDocId(1);
		
		boardDocServiceImpl.update(doc);
	}
	
	/*@Test
	public void list() {
		BoardDocDTO list = new BoardDocDTO();
		list.setMapId(8);
		List<BoardDocDTO> pageList = boardDocServiceImpl.list(list);
		for(BoardDocDTO boardDocDTO : pageList) {
			logger.debug("list==>"+ boardDocDTO.toString());
		}
	
	}*/
	
	
}