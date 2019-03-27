package com.mawang.jdbcTest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mawang.util.JDBCUtil;

public class MainTest {

	public static void main(String[] args) {
		Connection conn = null;
		Statement st = null;
		ResultSet rs = null;
		
		try {
			
			conn = JDBCUtil.getConnection();
			
			st = conn.createStatement();
			
			String sql = "select * from class1";
			rs = st.executeQuery(sql);
			
			while(rs.next()) {
				int id = rs.getInt("id");
				String name = rs.getString("name");
				int age = rs.getInt("age");
				
				System.out.println("id = " + id + " name = " + name + " age = " + age);
			}
			
		} catch (SQLException e) {
			
			e.printStackTrace();
			
		} finally {
			JDBCUtil.jdbcCloseAll(conn, st, rs);
		}
	}

}
