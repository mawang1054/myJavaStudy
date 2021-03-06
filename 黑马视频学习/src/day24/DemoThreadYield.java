package day24;

public class DemoThreadYield {
	public static void main(String[] args) {
		MyThread2 t1 = new MyThread2();
		MyThread2 t2 = new MyThread2();
		
		t1.start();
		t2.start();
	}
}

class MyThread2 extends Thread {
	public void run() {
		for(int i = 0; i < 1000; ++i) {
			System.out.println(this.getName() + "--" + i);
			if (i % 10 == 0)
				Thread.yield();
		}
	}
}
