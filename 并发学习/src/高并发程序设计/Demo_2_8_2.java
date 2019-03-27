package 高并发程序设计;

import java.util.ArrayList;
import java.util.Vector;

public class Demo_2_8_2 {
	static Vector<Integer> list = new Vector<>();
	
	static class MyThread implements Runnable{

		@Override
		public void run() {
			for(int i = 0; i < 100000; ++i) {
				list.add(i);
			}
		}
		
	}
	
	public static void main(String[] args) throws InterruptedException {
		Thread t1 =  new Thread(new MyThread());
		Thread t2 =  new Thread(new MyThread());
		t1.start();
		t2.start();
		t1.join();
		t2.join();
		System.out.println(list.size());
	}
}
