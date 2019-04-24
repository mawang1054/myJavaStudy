package com.mawang.mybatis.util;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class SqlSessionFactoryUtil {
	private static SqlSessionFactory ssf;

	static {		
		try {
			SqlSessionFactoryBuilder ssfb = new SqlSessionFactoryBuilder();
			
			InputStream is = Resources.getResourceAsStream("SqlMapConfig.xml");
			
			ssf = ssfb.build(is);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static SqlSessionFactory getSqlSessionFactory() {
		return ssf;
	}
}
