package day25;

public class DemoThreadWait1 {
	public static void main(String[] args) {
		new Thread () {
			public void run() {
				while(true) {
					System.out.println(this.getName() + "--");
					try {
						this.wait();
					} catch (InterruptedException e) {
						// TODO �Զ����ɵ� catch ��
						e.printStackTrace();
					}
				}
			}
		}.start();
		new Thread () {
			public void run() {
				while(true) {
					System.out.println(this.getName() + "--");
					try {
						this.wait();
					} catch (InterruptedException e) {
						// TODO �Զ����ɵ� catch ��
						e.printStackTrace();
					}
				}
			}
		}.start();
	}
}
