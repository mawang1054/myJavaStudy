package com.mawang.mybatis.dao;

import java.util.List;

import com.mawang.mybatis.pojo.User;

public interface UserDao {
	public User getUserById(Integer id);
	
	public List<User> getUserByUsername(String username);
	
	public void insertUser(User user);
	
}
