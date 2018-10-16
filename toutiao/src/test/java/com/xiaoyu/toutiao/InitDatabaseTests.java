package com.xiaoyu.toutiao;

import com.xiaoyu.toutiao.dao.UserDAO;
import com.xiaoyu.toutiao.model.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;
import  java.util.Random;

@RunWith(SpringRunner.class)
@SpringBootTest
//@RunWith(SpringJUnit4ClassRunner.class)
//@SpringApplicationConfiguration(class=ToutiaoApplication.class)
@Sql("/init-schema.sql")
public class InitDatabaseTests {
	@Autowired
	UserDAO userDAO;
	@Test
	public void contextLoads() {
		for(int i=0;i<11;i++){
			User user =new User();
			user.setHeadUrl(String.format("http://images.nowcoder.com/head/%dt.png"));
			user.setName(String.format("USER%d",i));
			user.setPassword("");
			user.setSalt("");
			userDAO.addUser(user);
		}
	}

}
