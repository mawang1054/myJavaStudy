package day14;

public class DemoSystem1 {
	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		for (int i = 0; i < 100000; ++i) {
			System.out.println("*");
		}
		long end = System.currentTimeMillis();
		System.out.println(end - start);
	}
}
