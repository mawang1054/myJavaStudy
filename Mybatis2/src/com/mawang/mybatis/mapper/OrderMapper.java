package com.mawang.mybatis.mapper;

import java.util.List;

import com.mawang.mybatis.pojo.Order;
import com.mawang.mybatis.pojo.OrderUser;

public interface OrderMapper {
	public List<Order> getOrderList(); 
	
	public List<OrderUser> getOrderUser();
	
	public List<Order> getOrderUserMap();
}
