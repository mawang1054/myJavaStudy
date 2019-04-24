package com.mawang.mybatis.dao.impl.test;

import static org.junit.Assert.*;

import java.util.Date;
import java.util.List;

import org.junit.Test;

import com.mawang.mybatis.dao.UserDao;
import com.mawang.mybatis.dao.impl.UserDaoImpl;
import com.mawang.mybatis.pojo.User;

public class UserDaoImplTest {

	@Test
	public void testGetUserById() {
		UserDao dao = new UserDaoImpl();
		User user = dao.getUserById(1);
		System.out.println(user);
	}

	@Test
	public void testGetUserByUsername() {
		UserDao dao = new UserDaoImpl();
		List<User> list = dao.getUserByUsername("%嘻嘻%");
		for (User user : list) {
			System.out.println(user);
		}
	}

	@Test
	public void testInsertUser() {
		UserDao dao = new UserDaoImpl();
		User user = new User();
		user.setUsername("嘻嘻");
		user.setAddress("深圳");
		user.setBirthday(new Date(25, 11, 21));
		user.setSex("女");
		dao.insertUser(user);
	}

}
