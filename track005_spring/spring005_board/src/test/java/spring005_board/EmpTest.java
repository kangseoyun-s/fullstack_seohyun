package spring005_board;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.thejoa703.dao.EmpDao;

@RunWith(SpringJUnit4ClassRunner.class)  //1. 스프링구동
@ContextConfiguration(locations = "classpath:config/root-context.xml") //2. 설정
public class EmpTest {
	@Autowired EmpDao dao;
	@Test public void test1() {
		Map<String, String> para = new HashMap<>();
		para.put("searchType", "ename");
		para.put("keyword", "SMITH");
		System.out.println(dao.test1(para));
	}

}
