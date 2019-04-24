package com.mawang.mybatis.dao.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.mawang.mybatis.dao.UserDao;
import com.mawang.mybatis.pojo.User;
import com.mawang.mybatis.util.SqlSessionFactoryUtil;

public class UserDaoImpl implements UserDao{

	@Override
	public User getUserById(Integer id) {
		SqlSession ss = SqlSessionFactoryUtil.getSqlSessionFactory().openSession();
		User user = ss.selectOne("user.getUserById", id);	
		ss.close();
		return user;
	}

	@Override
	public List<User> getUserByUsername(String username) {
		SqlSession ss = SqlSessionFactoryUtil.getSqlSessionFactory().openSession();
		List<User> list = ss.selectList("user.getUserByUsername", username);
		ss.close();
		return list;
	}

	@Override
	public void insertUser(User user) {
		SqlSession ss = SqlSessionFactoryUtil.getSqlSessionFactory().openSession(true);
		ss.insert("user.insertUser", user);
		//ss.commit();
		ss.close();
	}

}
