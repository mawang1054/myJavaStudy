package day24;

public class DemoThread1 {
	public static void main(String[] args) {
		MyThread mt = new MyThread();
		mt.start();	
		
		for (int i = 0; i < 10000; ++i) {
			System.out.println("Main");
	
		}
	}
}

class MyThread extends Thread {
	public void run() {
		for (int i = 0; i < 10000; ++i) {
			System.out.println("MyThread");
		}
	}
}