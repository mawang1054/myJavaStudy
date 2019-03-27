package com.mawang.dao;

import java.util.List;

import com.mawang.util.User;

public interface UserDao {
	List<User> findAll();
	
	void login(String username, String password);
	
	int insert(String username, String password);
	
	int delete(int id);
	
	int delete(String name);
	
	int update(int id, String name);
}
