package 高并发程序设计;

public class Demo_2_7 {
	static volatile int i = 0;
	static Object obj = new Object();
	
	static class MyThread1 implements Runnable{
		@Override
		public void run() {
			increase();
		}
	}
	
	public static void main(String[] args) throws InterruptedException {
		Thread t1 = new Thread(new MyThread1());
		Thread t2 = new Thread(new MyThread1());
		
		t1.start();
		t2.start();
		
		t1.join();
		t2.join();
		
		System.out.println(i);
	}

	public static void increase() {
		for (int i = 0; i < 100000 ; ++i) {
			Demo_2_7.i++;
		}
	}
}


