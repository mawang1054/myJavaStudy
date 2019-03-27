package oopTest.运行顺序;

class B extends A{


	public B() {
		System.out.println("B");
	}
	public static void main(String[] args) {
		B b = new B();
	}	
}

class A {
	
	static {
		System.out.println("static");
	}private static A a = new A();
	public A() {
		System.out.println("A");
	}
}
