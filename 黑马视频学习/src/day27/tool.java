package day27;

import java.lang.reflect.Field;

public class tool {
	public static void setPrpperty(Object obj, String propertyName, Object value) throws Exception {
		Class clazz = obj.getClass();
		Field field = clazz.getDeclaredField(propertyName);
		field.setAccessible(true);
		field.set(obj, value);
	}
	
	public static void main(String[] args) throws Exception {
		student s = new student("mawang",18);
		System.out.println(s);
		
		tool.setPrpperty(s, "age", 19);
		System.out.println(s);
	}
}

class student{
	private String name;
	private int age;
	public student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public student() {
		super();
		// TODO 自动生成的构造函数存根
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "student [name=" + name + ", age=" + age + "]";
	}
	
	
}