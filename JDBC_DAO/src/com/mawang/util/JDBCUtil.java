package com.mawang.util;

import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class JDBCUtil {
	static String url;
	static String username;
	static String password;
	static String drivername;
	
	static {
		try {
			Properties pro = new Properties();
			InputStream is = new FileInputStream("src/jdbc.properties");
			pro.load(is);
			url = pro.getProperty("url");          
			username = pro.getProperty("username");
			password = pro.getProperty("password");         
			drivername = pro.getProperty("drivername");      
			                  
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private JDBCUtil() {}
	
	public static Connection getConnection() {		
		try {			
			//DriverManager.registerDriver(new com.mysql.jdbc.Driver());
			Class.forName(drivername);
			return DriverManager.getConnection(url, username, password);			
		} catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public static void jdbcCloseAll(java.sql.Connection conn,
			java.sql.Statement st,java.sql.ResultSet rs) {
		closeResultSet(rs);
		closeStatement(st);
		closeConnection(conn);
	}
	
	public static void jdbcCloseAll(java.sql.Connection conn,
			java.sql.Statement st) {
		closeStatement(st);
		closeConnection(conn);
	}
	
	private static void closeConnection(java.sql.Connection conn) {
		if (conn == null)
			return;
		else {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
	private static void closeStatement(java.sql.Statement st) {
		if (st == null)
			return;
		else {
			try {
				st.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
	private static  void closeResultSet(java.sql.ResultSet rs) {
		if (rs == null)
			return;
		else {
			try {
				rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
