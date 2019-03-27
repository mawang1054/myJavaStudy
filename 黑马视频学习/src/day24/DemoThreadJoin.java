package day24;

public class DemoThreadJoin {
	public static void main(String[] args) {
		Thread thread1 = new Thread() {

			@Override
			public void run() {
				for (int i = 0; i < 10; ++i) {

					System.out.println(this.getName());
				}
			}
			
		};
		
		Thread thread2 = new Thread() {

			@Override
			public void run() {
				for (int i = 0; i < 10; ++i) {
					if (i == 2) {
						try {
							thread1.join();
						} catch (InterruptedException e) {
							// TODO 自动生成的 catch 块
							e.printStackTrace();
						}
					}
					System.out.println(this.getName());
				}
			}
			
		};
		
		thread1.start();
		thread2.start();
	}
}
