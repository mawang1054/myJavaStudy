package com.mawang.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.mawang.util.User;
import com.mawang.dao.UserDao;
import com.mawang.util.JDBCUtil;

public class UserDaoImpl implements UserDao {

	@Override
	public List<User> findAll() {
		Connection conn = JDBCUtil.getConnection();
		Statement st = null;
		ResultSet rs = null;
		ArrayList<User> list = new ArrayList<>();
		try {
			st = conn.createStatement();
			
			String sql = "select * from user";
			rs = st.executeQuery(sql);
			
			while(rs.next()) {
				list.add(new User(rs.getString("username"), rs.getString("password")));
				System.out.println("username = " + rs.getString("username") 
				+ "  password = " + rs.getString("password"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.jdbcCloseAll(conn, st, rs);
		}
		return list;
	}

	
	@Override
	public void login(String username, String password) {
		Connection conn = JDBCUtil.getConnection();
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
//			st = conn.createStatement();
//			
//			String sql = "select * from user where username = '"+ username
//					+"' and password = '"+ password +"'";
//			rs = st.executeQuery(sql);
			
			String sql = "select * from user where username = ? and password = ?";
			ps = conn.prepareStatement(sql);
			
			ps.setString(1, username);
			ps.setString(2, password);
			
			rs = ps.executeQuery();
			
			if (rs.next()) {
				System.out.println("登陆成功!");
			}else {
				System.out.println("登陆失败!");
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.jdbcCloseAll(conn, ps, rs);
		}
	}


	@Override
	public int insert(String username, String password) {
		Connection conn = JDBCUtil.getConnection();
		PreparedStatement ps = null;
		int i = 0;
		try {
			String sql = "insert into user values (null,?,?)";
			ps = conn.prepareStatement(sql);
			
			ps.setString(1, username);
			ps.setString(2, password);
			
			i = ps.executeUpdate();
			
			if (i == 1) {
				System.out.println("添加成功!");
			}else {
				System.out.println("添加失败!");
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.jdbcCloseAll(conn, ps);
		}
		return i;
	}


	@Override
	public int delete(int id) {
		Connection conn = JDBCUtil.getConnection();
		PreparedStatement ps = null;
		int i = 0;
		try {
			String sql = "delete from user where id = ?";
			ps = conn.prepareStatement(sql);
			
			ps.setInt(1, id);
			i = ps.executeUpdate();
			
			if(i > 0) {
				System.out.println("删除成功!");
			} else {
				System.out.println("删除失败!");
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.jdbcCloseAll(conn, ps);
		}
		return i;
	}


	@Override
	public int delete(String name) {
		Connection conn = JDBCUtil.getConnection();
		PreparedStatement ps = null;
		int i = 0;
		try {
			String sql = "delete from user where username = ?";
			ps = conn.prepareStatement(sql);
			
			ps.setString(1, name);
			i = ps.executeUpdate();
			
			if(i > 0) {
				System.out.println("删除成功!");
			} else {
				System.out.println("删除失败!");
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.jdbcCloseAll(conn, ps);
		}
		return i;
	}


	@Override
	public int update(int id, String name) {
		Connection conn = JDBCUtil.getConnection();
		PreparedStatement ps = null;
		int i = 0;
		try {
			String sql = "update user set username = ? where id = ?";
			ps = conn.prepareStatement(sql);
			ps.setString(1, name);
			ps.setInt(2, id);
			i = ps.executeUpdate();
			if (i > 0) {
				System.out.println("更新成功!");
			} else {
				System.out.println("更新失败!");
			} 
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.jdbcCloseAll(conn, ps);
		}
		return i;
	}
	
	
}
