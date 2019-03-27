package 高并发程序设计;

public class Demo_2_2_5 {
	public static Object obj = new Object();
	
	public static class ChangeObjectThread extends Thread {
		volatile boolean suspendme = false;
		
		public void suspendMe() {
			suspendme = true;
		}
		
		public void resumeMe() {
			suspendme = false;
			synchronized(this) {
				notify();
			}
		}
		
		public void run() {
			while(true) {
				synchronized(this) {
					while(suspendme) {
						try {
							this.wait();
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				}
				
				synchronized(obj) {
					try {
						Thread.sleep(10);
					} catch (InterruptedException e) {
						// TODO 自动生成的 catch 块
						e.printStackTrace();
					}
					System.out.println(System.currentTimeMillis() + ":t1");
				}
				
				Thread.yield();
			}
		}
	}
	
	public static class ReadObjectThread extends Thread{

		@Override
		public void run() {
			while(true) {
				synchronized(obj) {
					try {
						Thread.sleep(10);
					} catch (InterruptedException e) {
						// TODO 自动生成的 catch 块
						e.printStackTrace();
					}
					System.out.println(System.currentTimeMillis() + ":t2");
				}
				Thread.yield();
			}
		}	
	}
	
	public static void main(String[] args) throws InterruptedException {
		ChangeObjectThread t1 = new ChangeObjectThread();
		ReadObjectThread t2 = new ReadObjectThread();
		
		t1.start();
		t2.start();
//		Thread.sleep(100);
//		t1.suspendMe();
//		System.out.println("wait t1 2 sec-------------------------------------------------------------");
//		Thread.sleep(200);
//		System.out.println("resume t1--------------------------------------------------------------------");
//		t1.resumeMe();
	}
}
