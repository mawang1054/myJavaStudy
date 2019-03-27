package day27;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class Demo1 {
	public static void main(String[] args) throws Exception {
		List<Integer> list = new ArrayList<Integer>();
		list.add(111);
		list.add(222);
		
		Class clazz = list.getClass();
		Method method = clazz.getMethod("add", Object.class);
		method.invoke(list, "aaa");
		
		System.out.println(list);
		
		Class clazz1 = Class.forName("day27.student");
		Constructor c = clazz1.getConstructor(String.class, int.class);
		student p = (student) c.newInstance("mawang", 18);
		System.out.println(p);
	}
}
