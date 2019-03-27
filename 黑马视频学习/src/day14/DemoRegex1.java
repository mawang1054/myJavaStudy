package day14;

public class DemoRegex1 {
	public static void main(String[] args) {
		String patter = "[a-be-f]";
		System.out.println("d".matches(patter));
		System.out.println("b".matches(patter));
		
		String patter1 = ".";
		System.out.println("".matches(patter1));
		
		String patter2 = "[:alpha:]";
		System.out.println("a".matches(patter2));
		System.out.println("=================");		
		贪婪型正则();
		System.out.println("=================");
		懒惰型正则();
		System.out.println("=================");		
	}

	private static void 懒惰型正则() {
		String patter3 = "<[Bb]>.*?</[Bb]>";
		String[] strArr = "a<b>ak</b>bcd<b>dhha</b>djfnjka".split(patter3);
		for (int i = 0; i < strArr.length; i++) {
			  System.out.println(strArr[i]);
		}
	}

	private static void 贪婪型正则() {
		String patter3 = "<[Bb]>.*</[Bb]>";
		String[] strArr = "a<b>ak</b>bcd<b>dhha</b>djfnjka".split(patter3);
		for (int i = 0; i < strArr.length; i++) {
			  System.out.println(strArr[i]);
		}
	}
}
