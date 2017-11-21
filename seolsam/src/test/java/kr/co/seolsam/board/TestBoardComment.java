package kr.co.seolsam.board;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import kr.co.seolsam.board.dto.BoardCommentDTO;
import kr.co.seolsam.board.service.IBoardCommentService;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={
 "file:src/main/webapp/WEB-INF/spring/appServlet/servlet-context.xml",
 "file:src/main/webapp/WEB-INF/spring/root-context.xml"}
)
public class TestBoardComment {
	private static final Logger logger = LoggerFactory.getLogger(TestBoardComment.class);
	
	@Autowired private IBoardCommentService BoardCommentServiceImpl=null;
	
	@Test
	public void write() {
		logger.debug("comment==>"+"comment");
		
		BoardCommentDTO com = new BoardCommentDTO();
		
		com.setUserId(1);
		com.setDocId(1);
		com.setBoardComment("sss");
		
		BoardCommentServiceImpl.insertData(com);
	}
	
	@Test
	public void view() {
		BoardCommentDTO com = BoardCommentServiceImpl.view(1);
		logger.debug("commentId==>"+com.toString());
	}

	@Test
	public void edit() {
		logger.debug("commentEdit==>" + "commentEdit");
	
		BoardCommentDTO com=new BoardCommentDTO();
		
		com.setCommentId(1);
		com.setBoardComment("fffffffffffffffffffffffffff");
		
		BoardCommentServiceImpl.update(com);
		
	}
}