package day24;

public class DemoThread7 {
	public static void main(String[] args) {
		new Thread("�߳�1") {

			@Override
			public void run() {
				this.setName("Thread1");
				for (int i = 0; i < 10; ++i) {
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO �Զ����ɵ� catch ��
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
						// TODO �Զ����ɵ� catch ��
						e.printStackTrace();
					}
					System.out.println(Thread.currentThread().getName());
				}
			}
			
		},"�߳�2").start();
	}
}
