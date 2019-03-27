package day24;

public class DemoThread7 {
	public static void main(String[] args) {
		new Thread("线程1") {

			@Override
			public void run() {
				this.setName("Thread1");
				for (int i = 0; i < 10; ++i) {
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO 自动生成的 catch 块
						e.printStackTrace();
					}
					System.out.println(this.getName());
				}
			}
			
		}.start();
		
		new Thread(new Runnable() {

			@Override
			public void run() {
				Thread.currentThread().setName("Thread2");
				for (int i = 0; i < 10; ++i) {
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO 自动生成的 catch 块
						e.printStackTrace();
					}
					System.out.println(Thread.currentThread().getName());
				}
			}
			
		},"线程2").start();
	}
}
