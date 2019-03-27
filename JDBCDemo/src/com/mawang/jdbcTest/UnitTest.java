package com.mawang.jdbcTest;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.junit.Test;

import com.mawang.util.JDBCUtil;

public class UnitTest {
	@Test
	public void testQuery() {
		Connection conn = JDBCUtil.getConnection();
		ResultSet rs = null;
		Statement st = null;
		try {
			st = conn.createStatement();
			
			String sql = "select * from table1";
			rs = st.executeQuery(sql);
			
			while(rs.next()) {
				System.out.println(rs.getInt("id") + " " + rs.getString("name") + " " + rs.getInt("age"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.jdbcCloseAll(conn, st, rs);
		}
	}

	@Test
	public void testInsert() {
		Connection conn = JDBCUtil.getConnection();
		Statement st = null;
		try {
			st = conn.createStatement();
			
			String sql = "insert into table1 values (null,'cc',22)";
			int result = st.executeUpdate(sql);
			
			System.out.println("影响行数: " + result);

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.jdbcCloseAll(conn, st);
		}
	}
	
	@Test
	public void testDelete() {
		Connection conn = JDBCUtil.getConnection();
		Statement st = null;
		try {
			st = conn.createStatement();
			
			String sql = "delete from table1 where id = 13";
			int result = st.executeUpdate(sql);
			
			System.out.println("影响行数: " + result);

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.jdbcCloseAll(conn, st);
		}
	}
	
	@Test
	public void testUpdate() {
		Connection conn = JDBCUtil.getConnection();
		Statement st = null;
		try {
			st = conn.createStatement();
			
			String sql = "update table1 set name = 'CC' where id = 14";
			int result = st.executeUpdate(sql);
			
			System.out.println("影响行数: " + result);

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.jdbcCloseAll(conn, st);
		}
	}
}
