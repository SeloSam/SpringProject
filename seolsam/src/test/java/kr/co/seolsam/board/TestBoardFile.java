package kr.co.seolsam.board;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import kr.co.seolsam.board.dto.BoardFileDTO;
import kr.co.seolsam.board.service.IBoardFileService;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={
 "file:src/main/webapp/WEB-INF/spring/appServlet/servlet-context.xml",
 "file:src/main/webapp/WEB-INF/spring/root-context.xml"}
)
public class TestBoardFile {
	private static final Logger logger = LoggerFactory.getLogger(TestBoardFile.class);
	
	@Autowired private IBoardFileService boardFileServiceImpl=null;
	
	@Test
	public void write() {
		logger.debug("File==>"+"file");
		
		BoardFileDTO file = new BoardFileDTO();
		
		file.setDocId(1);
		file.setFileId(1);
		file.setOrgFileName("goot dameny11");
		file.setNewFileName("qqewqq1232132131");
		file.setFileType("F");
		file.setFileSize(20);
		file.setFilePath("hire");
		file.setExt("exe");
		
		boardFileServiceImpl.insertData(file);
	}
	
	@Test
	public void view() {
		BoardFileDTO file = boardFileServiceImpl.view(1);
		logger.debug("fileId==>"+file.toString());
	}

	@Test
	public void remove() {
		BoardFileDTO file = new BoardFileDTO();
		
		file.setFileId(4);
		boardFileServiceImpl.delete(file);
	}
}