package oopTest;

public class DemoString {

	public static void main(String[] args) {
		String name = "你好";
		System.out.println(name.length());
		
		byte[] a = name.getBytes();
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		
		System.out.println();
		
		char[] b = name.toCharArray();
		for (int i = 0; i < b.length; i++) {
			System.out.print((int)b[i] + " ");
		}
		
		String c = String.valueOf(45454.2);
		System.out.println(c);
	}

}
