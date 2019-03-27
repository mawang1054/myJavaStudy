package day24;

public class DemoThread4 {
	public static void main(String[] args) {
		new Thread(new Runnable() {

			@Override
			public void run() {
				for (int i = 0; i < 10000; ++i) {
					System.out.println("111");
				}
			}
			
		}).start();
		new Thread(new Runnable() {

			@Override
			public void run() {
				for (int i = 0; i < 10000; ++i) {
					System.out.println("222");
				}
			}
			
		}).start();
	}
}
