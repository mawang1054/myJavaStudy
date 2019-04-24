package 高并发程序设计;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class Demo_3_1_1_读写锁 {
	public static void main(String[] args) throws InterruptedException {
		final ReadWriteLockDemo demo = new ReadWriteLockDemo(0);
		Runnable readThread = new Runnable() {
			@Override
			public void run() {	
				try {
					demo.headleRead();
				} catch (InterruptedException e) {
					// TODO 自动生成的 catch 块
					e.printStackTrace();
				}
			}
		};
		
		Runnable writeThread = new Runnable() {
			@Override
			public void run() {	
				demo.headleWrite(1);
			}
		};
		long startTime = System.currentTimeMillis();
//		for(int i = 0; i < 8; ++i) {
//			new Thread(readThread).start();
//		}
//		
//		for(int i = 0; i < 2; ++i) {
//			new Thread(writeThread).start();
//		}
//		ReadWriteLockDemo.cdl.await();
		for(int i = 0; i < 1000000000; ++i)
			for(int j = 0; j < 1000000000; ++j)
				for(int z = 0; z < 100; ++z);
		long endTime = System.currentTimeMillis();
		System.out.println(endTime - startTime);
	}
}

class ReadWriteLockDemo  {
	private static Lock lock = new ReentrantLock();
	private static ReentrantReadWriteLock readwriteLock = new ReentrantReadWriteLock();
	private static Lock readLock = readwriteLock.readLock();
	private static Lock writeLock = readwriteLock.writeLock();
	 static CountDownLatch cdl = new CountDownLatch(10);
	private int value;
	
	public ReadWriteLockDemo(int value) {
		super();
		this.value = value;
	}

	public int headleRead() throws InterruptedException {
		try {
			readLock.lock();
//			Thread.sleep(1000);
			for(int i = 0; i < 100000; ++i);
			return value;
		} finally {
			cdl.countDown();
			readLock.unlock();
		}
	}
	
	public void headleWrite(int value) {
		try {
			writeLock.lock();
			Thread.sleep(1000);
			this.value = value;
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			cdl.countDown();
			writeLock.unlock();
		}
	}
	

}