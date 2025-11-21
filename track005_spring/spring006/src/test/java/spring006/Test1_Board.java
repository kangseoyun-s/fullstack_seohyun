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
	
	@Ignore @Test public void test4() {
		
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
	@Ignore @Test public void test6() {
		System.out.println(dao.iddouble("1@1"));
		System.out.println(dao.iddouble("9@9"));
	}
	@Ignore @Test public void test7() {
		UserDto dto = new UserDto();
		dto.setMbtiTypeId(2); dto.setAppUserId(68);
		System.out.println(dao.updateAdmin(dto));
		System.out.println(dao.selectAll());
		
	}
	@Test public void test8() {
		UserDto dto = new UserDto();
		dto.setAppUserId(68);
		System.out.println(dao.deleteAdmin(dto));
		System.out.println(dao.selectAll());
}
}