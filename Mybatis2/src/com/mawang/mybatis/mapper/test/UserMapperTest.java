package com.mawang.mybatis.mapper.test;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import com.mawang.mybatis.mapper.UserMapper;
import com.mawang.mybatis.pojo.QueryVo;
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

	@Test
	public void testGetPojoByQueryVo() {
		SqlSession sqlSession = SqlSessionFactoryUtil.getSqlSessionFactory().openSession();
		
		UserMapper mapper = sqlSession.getMapper(UserMapper.class);
		
		User user = new User();
		user.setUsername("赵子龙");
		QueryVo qv = new QueryVo();
		qv.setUser(user);

		
		List<User> list = mapper.getUserByQueryVo(qv);
		
		for (User user2 : list) {
			System.out.println(user2);
		}
		
		sqlSession.close();
	}
	
	@Test
	public void testGetUesrCount() {
		SqlSession sqlSession = SqlSessionFactoryUtil.getSqlSessionFactory().openSession();
		
		UserMapper mapper = sqlSession.getMapper(UserMapper.class);
		
		int count = mapper.getUserCount();
		
		System.out.println(count);
		
		sqlSession.close();
	}
	
	@Test
	public void testGetUserByUser() {
		SqlSession sqlSession = SqlSessionFactoryUtil.getSqlSessionFactory().openSession();
		
		UserMapper mapper = sqlSession.getMapper(UserMapper.class);
		
		User user = new User();
		user.setSex(null);
		user.setUsername("马");
		
		List<User> list = mapper.getUserByUser(user);
		
		for (User user2 : list) {
			System.out.println(user2);
		}
		
		sqlSession.close();
	}
	
	@Test
	public void testGetUserByIdIn() {
		SqlSession sqlSession = SqlSessionFactoryUtil.getSqlSessionFactory().openSession();
		
		UserMapper mapper = sqlSession.getMapper(UserMapper.class);
		
		QueryVo qv = new QueryVo();
		ArrayList<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(10);
		list.add(16);
		list.add(25);
		qv.setIds(list);
		
		List<User> list2 = mapper.getUserByIdIn(qv);
		
		for (User user : list2) {
			System.out.println(user);
		}
		
		sqlSession.close();
		
	}
}
