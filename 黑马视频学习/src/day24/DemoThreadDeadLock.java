package day24;

public class DemoThreadDeadLock {
	private static String s1 = "左";
	private static String s2 = "右";
	
	public static void main(String[] args) {
		new Thread() {
			@Override
			public void run() {
				while(true) {
					synchronized(s1) {
						System.out.println("拿到s1，请求s2");
						synchronized(s2) {
							System.out.println("拿到s2");
						}
					}
				}
			}			
		}.start();
		new Thread() {
			@Override
			public void run() {
				while(true) {
					synchronized(s2) {
						System.out.println("拿到s2，请求s1");
						synchronized(s1) {
							System.out.println("拿到s1");
						}
					}
				}
			}			
		}.start();
	}
}
