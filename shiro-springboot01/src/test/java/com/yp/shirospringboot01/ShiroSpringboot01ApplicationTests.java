package com.yp.shirospringboot01;

import com.yp.shirospringboot01.service.UserService;
import com.yp.shirospringboot01.service.UserServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ShiroSpringboot01ApplicationTests {

	@Autowired
	UserServiceImpl userService;

	@Test
	void contextLoads() {
		System.out.println(userService.queryUserByName("ld"));
	}

}
