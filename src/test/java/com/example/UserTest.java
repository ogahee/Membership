package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.List;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.example.service.UserService;
import com.example.vo.UserVo;

@ExtendWith(SpringExtension.class)
@ContextConfiguration("classpath:beans.xml")
class UserTest {
	@Autowired
	private UserService userService;
	
	@Disabled @Test
	public void test() {
		assertNotNull(this.userService);
	}
	
	@Test
	public void test1() {
		UserVo user = this.userService.selectUser("chulsu");
		assertEquals("박철수", user.getName());
		System.out.println(user);
	}
	
	@Disabled @Test
	public void test2() {
		UserVo user = new UserVo("javaexpert", "박지민", "여", "인천");
		int rowcount = this.userService.insertUser(user);
		assertEquals(1, rowcount);
	}
	
	@Disabled @Test
	public void test3() {
		int rowcount = this.userService.deleteUser("javaexpert");
		assertEquals(1, rowcount);
	}
	
	@Test
	public void test4() {
		UserVo user = new UserVo("chulsu", "박철수", "남", "광주");
		int rowcount = this.userService.updateUser(user);
		assertEquals(1, rowcount);
	}
	
	@Test
	public void test5() {
		List<UserVo> list = this.userService.selectAllUsers();
		for(UserVo user : list) {
			System.out.println(user);
		}
	}
}
