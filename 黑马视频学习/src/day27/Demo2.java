package day27;

import java.io.FileInputStream;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.Properties;

public class Demo2 {
	public static void main(String[] args) throws Exception {
		
		InputStream fis = new FileInputStream("src/day27/name.properties");
		Properties pro = new Properties();
		pro.load(fis);
		String className = pro.getProperty("ClassName");
		Class clazz = Class.forName(className);
		Method method = clazz.getMethod("run");
		method.invoke(clazz.newInstance());
	}

}
