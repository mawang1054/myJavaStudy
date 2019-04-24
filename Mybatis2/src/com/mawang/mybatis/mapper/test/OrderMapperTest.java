package com.mawang.mybatis.mapper.test;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import com.mawang.mybatis.mapper.OrderMapper;
import com.mawang.mybatis.pojo.Order;
import com.mawang.mybatis.pojo.OrderUser;
import com.mawang.mybatis.util.SqlSessionFactoryUtil;

public class OrderMapperTest {
	@Test
	public void testGetOrderList() {
		SqlSession sqlSession = SqlSessionFactoryUtil.getSqlSessionFactory().openSession();
		
		OrderMapper mapper = sqlSession.getMapper(OrderMapper.class);
		
		List<Order> list = mapper.getOrderList();
		
		for (Order order : list) {
			System.out.println(order);
		}
		
		sqlSession.close();
	}
	
	@Test
	public void testGetOrderUser() {
		SqlSession sqlSession = SqlSessionFactoryUtil.getSqlSessionFactory().openSession();
		
		OrderMapper mapper = sqlSession.getMapper(OrderMapper.class);
		
		List<OrderUser> list = mapper.getOrderUser();
		
		for (OrderUser orderUser : list) {
			System.out.println(orderUser);
		}
		
		sqlSession.close();
	}
	
	@Test
	public void testGetOrderUserMap() {
		SqlSession sqlSession = SqlSessionFactoryUtil.getSqlSessionFactory().openSession();
		
		OrderMapper mapper = sqlSession.getMapper(OrderMapper.class);
		
		List<Order> list = mapper.getOrderUserMap();
		
		for (Order orderUser : list) {
			System.out.println(orderUser);
			System.out.println(orderUser.getUser());
		}
		
		sqlSession.close();
	}
}
