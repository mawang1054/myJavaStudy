package com.mawang.test;

import java.util.Date;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import com.mawang.Mapper.CreateTableMapper;
import com.mawang.Mapper.UserMapper;
import com.mawang.pojo.User;
import com.mawang.util.SqlSessionFactoryUtil;

public class DemoTest {
	@Test
	public void testCreateTable() {
		SqlSession sqlSession = SqlSessionFactoryUtil.getSqlSessionFactory().openSession();
		
		CreateTableMapper mapper = sqlSession.getMapper(CreateTableMapper.class);
		
		mapper.createTable();
		
		sqlSession.close();
	}
	
	@Test
	public void testInsert() {
		SqlSession sqlSession = SqlSessionFactoryUtil.getSqlSessionFactory().openSession();
		
		UserMapper mapper = sqlSession.getMapper(UserMapper.class);
		
		User user = new User();
		user.setCreate_at(new Date());
		user.setGender("男");
		user.setPassword("123456");
		user.setUsername("mawang");
		
		mapper.insert(user);
		
		sqlSession.commit();
		
		sqlSession.close();
	}

	@Test
	public void testUpdate() {
		SqlSession sqlSession = SqlSessionFactoryUtil.getSqlSessionFactory().openSession();
		
		UserMapper mapper = sqlSession.getMapper(UserMapper.class);
		
		User user = new User();
		user.setId(2);
		user.setCreate_at(new Date());
		user.setGender("男");
		user.setPassword("123456");
		user.setUsername("ccc");
		
		mapper.update(user);
		
		sqlSession.commit();
		
		sqlSession.close();
	}
	
	@Test
	public void testSelect() {
		SqlSession sqlSession = SqlSessionFactoryUtil.getSqlSessionFactory().openSession();
		
		UserMapper mapper = sqlSession.getMapper(UserMapper.class);
		
		String username = "mawang";
		
		List<User> list = mapper.select(username);
		for (User user : list) {
			System.out.println(user);
		}
		
		sqlSession.close();
	}
}
