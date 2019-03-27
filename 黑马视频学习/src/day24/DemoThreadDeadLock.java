package day24;

public class DemoThreadDeadLock {
	private static String s1 = "��";
	private static String s2 = "��";
	
	public static void main(String[] args) {
		new Thread() {
			@Override
			public void run() {
				while(true) {
					synchronized(s1) {
						System.out.println("�õ�s1������s2");
						synchronized(s2) {
							System.out.println("�õ�s2");
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
						System.out.println("�õ�s2������s1");
						synchronized(s1) {
							System.out.println("�õ�s1");
						}
					}
				}
			}			
		}.start();
	}
}
