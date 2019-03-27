package day24;

public class DemoThread8 {
	public static Object obj = new Object();
	
	public static class MyThread extends Thread{
		public MyThread(String name) {
			super(name);
		}

		@Override
		public void run() {
			synchronized(obj) {
				System.out.println(System.currentTimeMillis() + ":" + this.getName());
				this.suspend();
				System.out.println("继续执行");
			}
		}
		
	}
	
	public static void main(String[] args) throws InterruptedException {
		Thread t1 = new MyThread("t1");
		Thread t2 = new MyThread("t2");
		
		t1.start();
		Thread.sleep(100);
		t2.start();
		t1.resume();
		t2.resume();
		t1.join();
		t2.join();
	}
}
