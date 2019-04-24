package 高并发程序设计;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Demo_3_1_1_公平锁 {
	public static void main(String[] args) throws InterruptedException {
		
		
		FairLock1 tl1 = new FairLock1();
		FairLock1 tl2 = new FairLock1();
		
		Thread t1 = new Thread(tl1);
		Thread t2 = new Thread(tl2);
		
		long startTime = System.currentTimeMillis();
		t1.start();
		t2.start();
		FairLock1.cdl.await();
		long endTime = System.currentTimeMillis();
		System.out.println(Thread.currentThread().getName() + " " + (endTime - startTime));
	}
}

class FairLock1 implements Runnable{
	private static Lock lock = new ReentrantLock(true);
	static CountDownLatch cdl = new CountDownLatch(2);
	
	@Override
	public void run() {
		for(int i = 0; i < 10000; ++i) {
			lock.lock();
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName());
			lock.unlock();
		}
		cdl.countDown();
	}
}