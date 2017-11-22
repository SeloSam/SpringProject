package kr.co.seolsam.user;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import kr.co.seolsam.board.dto.UserDTO;
import kr.co.seolsam.board.service.IUserService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={
 "file:src/main/webapp/WEB-INF/spring/appServlet/servlet-context.xml",
 "file:src/main/webapp/WEB-INF/spring/root-context.xml"}
)
public class TestUser {
	private static final Logger logger = LoggerFactory.getLogger(TestUser.class);
	
	@Autowired private IUserService userServiceImpl=null;
	
	@Test
	public void write() {
		logger.debug("user==>"+"user");
		
		UserDTO user=new UserDTO();
		
		user.setEmail("s@naver.com");
		user.setName("���");
		user.setLgnId("abc");
		user.setLgnPw("1234");
		user.setPhone("12345123");
		user.setRole("TR");
		user.setStatus(1);
		
		userServiceImpl.insertData(user);
	}
	
	@Test
	public void view() {
		UserDTO user = userServiceImpl.view(1);
		logger.debug("userId==>"+user.toString());
	}
	
	@Test
	public void edit() {
		logger.debug("userEdit==>" + "user");
		
		UserDTO user=new UserDTO();
		
		user.setUserId(10000000);
		
		user.setLgnPw("2345");
		user.setPhone("23123123123");
		user.setEmail("v@naver.com");
		
		userServiceImpl.update(user);
	}
	
	@Test
	public void list() {
		List<UserDTO> selectList = userServiceImpl.selectList();
		for (UserDTO userlist : selectList) {
			logger.debug("userList==>" + userlist.toString());
		}
		
	}
	
}
