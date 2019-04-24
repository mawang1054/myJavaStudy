package com.mawang.mybatis.test;

import java.io.IOException;
import java.io.InputStream;
import java.util.Date;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import com.mawang.mybatis.pojo.User;
import com.mawang.mybatis.util.SqlSessionFactoryUtil;

public class Test1 {	
	

	
	@Test
	public void testId() throws Exception {
		SqlSessionFactory ssf = SqlSessionFactoryUtil.getSqlSessionFactory();
		
		SqlSession session = ssf.openSession();
		
		User user = session.selectOne("user.getUserById", 2);
		
		System.out.println(user);
		
		session.close();
	}


	
	@Test
	public void testUsername() throws IOException {
		SqlSessionFactory ssf = SqlSessionFactoryUtil.getSqlSessionFactory();
		
		SqlSession session = ssf.openSession();
		
		List<User> list = session.selectList("user.getUserByUsername", "mawang");
		
//		System.out.println(list.size());
		
		for(User user : list) {
			System.out.println(user);
		}
		
		session.close();
	}
	
	@Test
	public void testInsertUser() throws IOException {
		SqlSessionFactory ssf = SqlSessionFactoryUtil.getSqlSessionFactory();
		
		SqlSession session = ssf.openSession();
		
		User user = new User();
		user.setUsername("马望3");
		user.setAddress("上海大学宝山校区");
		user.setBirthday(new Date(1995, 12, 21));
		user.setSex("男");
		
		session.insert("user.insertUser", user);
		
		session.commit();
		
		System.out.println(user);
		
		session.close();
	}
	
	@Test
	public void testUpdataUsername() {
		SqlSessionFactory ssf = SqlSessionFactoryUtil.getSqlSessionFactory();
		
		SqlSession session = ssf.openSession();
		
		User user = new User();
		
		user.setUsername("mawang");
		user.setId(33);
		
		session.update("user.updateUsername", user);
		
		session.commit();
		
		session.close();
	}
	
	@Test
	public void testDeleteUser() {
		SqlSessionFactory ssf = SqlSessionFactoryUtil.getSqlSessionFactory();
		
		SqlSession session = ssf.openSession();
		
		session.delete("user.deleteUser", 33);
		
		session.commit();
		
		session.close();
	}
}
