package day27.动态代理;

import java.lang.reflect.Proxy;

public class Test {
	public static void main(String[] args) {
		UserImpl ui = new UserImpl();
		ui.add();
		ui.delete();
		
		System.out.println("--------------------------");
		
		MyProxy myProxy = new MyProxy(ui);
		User user = (User) Proxy.newProxyInstance(ui.getClass().getClassLoader(), ui.getClass().getInterfaces(), myProxy);
		user.add();
		user.delete();
	}
}
