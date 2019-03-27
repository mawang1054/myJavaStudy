package com.mawang.test;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.mawang.dao.UserDao;
import com.mawang.dao.impl.UserDaoImpl;
import com.mawang.util.User;

public class TestUserDaoImpl {
	
	@Test
	public void testFindAll() {
		UserDao dao = new UserDaoImpl();
		List<User> list = dao.findAll();
		for ( User i : list) {
			System.out.println(i);
		}
	}
	
	@Test
	public void testLogin() {
		UserDao dao = new UserDaoImpl();
		dao.login("admin", "123456");
	}
	
	@Test
	public void testInsert() {
		UserDao dao = new UserDaoImpl();
		System.out.println(dao.insert("ccc", "12345"));
	}
	
	@Test
	public void testDelete() {
		UserDao dao = new UserDaoImpl();
		//dao.delete(3);
		System.out.println(dao.delete("ccc"));
	}
	
	@Test
	public void testUpdate() {
		UserDao dao = new UserDaoImpl();
		System.out.println(dao.update(4, "CC"));
	}
}
