package day14;
/*
 * ���ʱ߽�̽��\b
 */
public class DemoRegex3 {
	public static void main(String[] args) {
		//�Ե��ʱ߽��з�();
		//�Էǵ��ʱ߽��з�();
		//java��֧�ֵĵ��ʱ߽�();
		String patter3 = "(?m)^d";
		String str = "dafdafaf\r\ndadadada";
		String[] strArr = str.split(patter3);
		for (int i = 0; i < strArr.length; i++) {
			  System.out.println(strArr[i]);
		}
	}

	private static void java��֧�ֵĵ��ʱ߽�() {
		String patter3 = "\\<"; // \<  \>
		System.out.println("dad".matches(patter3));
		String[] strArr = "a b  c".split(patter3);
		for (int i = 0; i < strArr.length; i++) {
			  System.out.println(strArr[i]);
		}
	}

	private static void �Էǵ��ʱ߽��з�() {
		String patter3 = "\\B";
		String[] strArr = "a b  c".split(patter3);
		for (int i = 0; i < strArr.length; i++) {
			  System.out.println(strArr[i]);
		}
	}

	private static void �Ե��ʱ߽��з�() {
		String patter3 = "\\b";
		String[] strArr = "a b c".split(patter3);
		for (int i = 0; i < strArr.length; i++) {
			  System.out.println(strArr[i]);
		}
	}
}
