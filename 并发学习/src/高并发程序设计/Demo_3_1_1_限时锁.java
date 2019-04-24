package 高并发程序设计;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Demo_3_1_1_限时锁 {
	public static void main(String[] args) {
		TryLock1 tl1 = new TryLock1(true);
		TryLock1 tl2 = new TryLock1(false);
		
		Thread t1 = new Thread(tl1);
		Thread t2 = new Thread(tl2);
		
		t1.start();
		t2.start();
	}
}

class TryLock1 implements Runnable{
	private static Lock lock1 = new ReentrantLock();
	private static Lock lock2 = new ReentrantLock();
	
	private boolean flag;
	
	public TryLock1(boolean flag) {
		super();
		this.flag = flag;
	}

	@Override
	public void run() {
		if(flag) {
			while(true) {
				if(lock1.tryLock()) {
					try {
						try {
							Thread.sleep(500);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
						if(lock2.tryLock()) {
							try {
								System.out.println(Thread.currentThread().getId() + ":My Job Done!");
								return;
							} finally {
								lock2.unlock();
							}
						} 
					}finally {
						lock1.unlock();
					}
				}
			}
		} else {
			while(true) {
				if(lock2.tryLock()) {
					try {
						try {
							Thread.sleep(500);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
						if(lock1.tryLock()) {
							try {
								System.out.println(Thread.currentThread().getId() + ":My Job Done!");
								return;
							} finally {
								lock1.unlock();
							}
						} 
					}finally {
						lock2.unlock();
					}
				}
			}
		}		
	}	
}