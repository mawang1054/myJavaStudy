package com.mawang.mybatis.mapper.test;

import static org.junit.Assert.*;

import java.util.Date;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import com.mawang.mybatis.mapper.UserMapper;
import com.mawang.mybatis.pojo.User;
import com.mawang.mybatis.util.SqlSessionFactoryUtil;

public class UserMapperTest {

	@Test
	public void testGetUserById() {
		SqlSession sqlSession = SqlSessionFactoryUtil.getSqlSessionFactory().openSession();
		
		UserMapper mapper = sqlSession.getMapper(UserMapper.class);
		
		User user = mapper.getUserById(1);
		
		System.out.println(user);
		
		sqlSession.close();
	}

	@Test
	public void testGetUserByUsername() {
		SqlSession sqlSession = SqlSessionFactoryUtil.getSqlSessionFactory().openSession();
		
		UserMapper mapper = sqlSession.getMapper(UserMapper.class);
		
		List<User> list = mapper.getUserByUsername("%马%");
		
		for (User user : list) {
			System.out.println(user);
		}
		
		sqlSession.close();
	}

	@Test
	public void testInsertUser() {
		SqlSession sqlSession = SqlSessionFactoryUtil.getSqlSessionFactory().openSession();
		
		UserMapper mapper = sqlSession.getMapper(UserMapper.class);
		
		User user = new User();
		user.setUsername("赵子龙");
		user.setAddress("上海大学宝山校区");
		user.setBirthday(new Date(1995, 12, 21));
		user.setSex("男");
		
		mapper.insertUser(user);
		
		sqlSession.commit();
		
		sqlSession.close();
	}

}
