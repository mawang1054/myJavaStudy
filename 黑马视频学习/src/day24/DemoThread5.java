package day24;

public class DemoThread5 {
	public static void main(String[] args) {
		new Thread("线程1") {

			@Override
			public void run() {
				this.setName("Thread1");
				for (int i = 0; i < 10000; ++i) {
					System.out.println(this.getName());
				}
			}
			
		}.start();
		
		new Thread(new Runnable() {

			@Override
			public void run() {
				Thread.currentThread().setName("Thread2");
				for (int i = 0; i < 10000; ++i) {
					System.out.println(Thread.currentThread().getName());
				}
			}
			
		},"线程2").start();
	}
}
