package day24;

public class DemoThread6 {
	public static void main(String[] args) throws InterruptedException {
		for (int i = 10; i >= 0; --i) {
			System.out.println("����ʱ" + i + "��");
			Thread.sleep(1000);
		}
	}
}
