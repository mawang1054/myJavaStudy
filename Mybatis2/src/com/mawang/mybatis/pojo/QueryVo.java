package com.mawang.mybatis.pojo;

import java.util.ArrayList;

public class QueryVo {
	private User user;
	
	private ArrayList<Integer> ids;

	public User getUser() {
		return user;
	}

	public ArrayList<Integer> getIds() {
		return ids;
	}

	public void setIds(ArrayList<Integer> ids) {
		this.ids = ids;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
	
}
