package day24;

public class DemoThread2 {
	public static void main(String[] args) {
		Thread t1 = new Thread(new MyRunnable());
		t1.start();
		
		for (int i = 0; i < 10000; ++i) {
			System.out.println("main");	
		}
	}
}

class MyRunnable implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 10000; ++i) {
			System.out.println("MyRunnable");	
		}
	}
	
}