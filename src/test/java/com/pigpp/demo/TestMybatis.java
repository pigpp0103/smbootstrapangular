package com.pigpp.demo;



import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.pigpp.demo.model.User;
import com.pigpp.demo.service.IUserService;


@RunWith(SpringJUnit4ClassRunner.class) // 琛ㄧず缁ф壙浜哠pringJUnit4ClassRunner绫�
@ContextConfiguration(locations = { "classpath:spring-mybatis.xml" })
public class TestMybatis {
	private static Logger logger = Logger.getLogger(TestMybatis.class);
	// private ApplicationContext ac = null;
	@Resource
	private IUserService userService = null;

	// @Before
	// public void before() {
	// ac = new ClassPathXmlApplicationContext("applicationContext.xml");
	// userService = (IUserService) ac.getBean("userService");
	// }
	@Test
	public void test1() {
//		User user = userService.getUserById(1);
		// System.out.println(user.getUserName());
		// logger.info("鍊硷細"+user.getUserName());
	}
} 