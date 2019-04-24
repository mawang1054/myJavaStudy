package com.mawang.jdbc.mybatis;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

public class MyBatisDemo1 {
	public static void main(String[] args) {
//		String url = null;
//		String username = null;
//		String password = null;
//		String drivername = null;
//		try {
//			Properties pro = new Properties();
//			InputStream is = new FileInputStream("src/jdbc.properties");
//			pro.load(is);
//			
//			url = pro.getProperty("url");
//			username = pro.getProperty("username");
//			password = pro.getProperty("password");
//			drivername = pro.getProperty("drivername");
//
//			Class.forName(drivername);
//			
//			Connection connection = DriverManager.getConnection(url,username,password);
//			
//			String sql = "select * from user where username = ?";
//			
//			PreparedStatement ps = connection.prepareStatement(sql);
//			
//			ps.setString(1, "张小明");
//			
//			ResultSet query = ps.executeQuery();
//			
//			while(query.next()) {
//				System.out.println(query.getString("id") + query.getString("username"));
//			}
//		} catch (Exception e) {
//			e.printStackTrace();
//		}	
		
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;

		try {
			// 加载数据库驱动
			Class.forName("com.mysql.jdbc.Driver");

			// 通过驱动管理类获取数据库链接
			connection = DriverManager.getConnection("jdbc:mysql://47.102.142.133:3306/mybatis", "mawang", "123456");
			// 定义sql语句 ?表示占位符
			String sql = "select * from user where username = ?";
			// 获取预处理statement
			preparedStatement = connection.prepareStatement(sql);
			// 设置参数，第一个参数为sql语句中参数的序号（从1开始），第二个参数为设置的参数值
			preparedStatement.setString(1, "王五");
			// 向数据库发出sql执行查询，查询出结果集
			resultSet = preparedStatement.executeQuery();
			// 遍历查询结果集
			while (resultSet.next()) {
				System.out.println(resultSet.getString("id") + "  " + resultSet.getString("username"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// 释放资源
			if (resultSet != null) {
				try {
					resultSet.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if (preparedStatement != null) {
				try {
					preparedStatement.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if (connection != null) {
				try {
					connection.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}

	}
}
