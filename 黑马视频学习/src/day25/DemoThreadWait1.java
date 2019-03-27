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
						// TODO 自动生成的 catch 块
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
						// TODO 自动生成的 catch 块
						e.printStackTrace();
					}
				}
			}
		}.start();
	}
}
