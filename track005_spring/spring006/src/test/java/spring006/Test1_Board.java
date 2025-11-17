package spring006;

import java.net.InetAddress;
import java.net.UnknownHostException;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSession;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.thejoa703.dao.UserDao;
import com.thejoa703.dto.UserDto;
import com.thejoa703.service.UserService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:config/root-context.xml")
public class Test1_Board {
	@Autowired ApplicationContext context;
	@Autowired DataSource ds;
	@Autowired SqlSession session;
	@Autowired UserDao dao;
	@Autowired UserService service;
	
	@Ignore @Test public void test1() {System.out.println(context);}
	@Ignore @Test public void test2() {System.out.println(ds);}
	@Ignore @Test public void test3() {System.out.println(session);}
	
	@Test public void test4() {
		
		UserDto dto = new UserDto();
		dto.setPassword("1"); dto.setAppUserId(44);
		System.out.println("6. " + dao.delete(dto));
		
//		UserDto dto = new UserDto();
//		dto.setEmail("c@c"); dto.setPassword("1111");
//		dto.setMbtiTypeId(1);
//		insert into appuser (APP_USER_ID, EMAIL, PASSWORD, MBTI_TYPE_ID)
//    	values (appuser_seq.nextval, 'a@a','1111',1);
//		
//		System.out.println("2. " + dao.insert(dto));
//		System.out.println("1. " + dao.selectAll());
	}
}