package com.mawang.Mapper;

import java.util.List;

import com.mawang.pojo.User;

public interface UserMapper {
	public void insert(User user);
	
	public void update(User user);
	
	public List<User> select(String username);
}
