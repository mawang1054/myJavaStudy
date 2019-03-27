package day24;

public class DemoThread3 {
	public static void main(String[] args) {
		new Thread() {

			@Override
			public void run() {
				for (int i = 0; i < 10000; ++i) {
					System.out.println(this.getName());
				}
			}
			
		}.start();
		
		new Thread() {

			@Override
			public void run() {
				for (int i = 0; i < 10000; ++i) {
					System.out.println(this.getName());
				}
			}
			
		}.start();
	}
}
