package com.mawang.mybatis.mapper;

import java.util.List;

import com.mawang.mybatis.pojo.QueryVo;
import com.mawang.mybatis.pojo.User;

public interface UserMapper {
	public User getUserById(Integer id);
	
	public List<User> getUserByUsername(String username);
	
	public void insertUser(User user);
	
	public List<User> getUserByQueryVo(QueryVo qv);
	
	public int getUserCount();
	
	public List<User> getUserByUser(User user);
	
	public List<User> getUserByIdIn(QueryVo qv);
}
