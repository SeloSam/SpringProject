package kr.co.seolsam.board;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import kr.co.seolsam.board.dto.BoardLikeDTO;
import kr.co.seolsam.board.service.IBoardLikeService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={
 "file:src/main/webapp/WEB-INF/spring/appServlet/servlet-context.xml",
 "file:src/main/webapp/WEB-INF/spring/root-context.xml"}
)
public class TestBoardLike {
	private static final Logger logger = LoggerFactory.getLogger(TestBoardLike.class);
	
	@Autowired private IBoardLikeService boardLikeServiceImpl=null;
	
	@Test
	public void write() {
		logger.debug("LIKE==>"+"like");
		
		BoardLikeDTO like = new BoardLikeDTO();
		
		like.setLikeYn("N");
		like.setUserId(1);
		like.setDocId(1);
		
		boardLikeServiceImpl.insertData(like);
	}
	
	@Test
	public void view() {
		BoardLikeDTO like = boardLikeServiceImpl.view(1);
		logger.debug("like==>"+like.toString());
	}
	
	
	
}