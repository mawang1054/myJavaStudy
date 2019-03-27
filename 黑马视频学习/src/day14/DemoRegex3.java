package day14;
/*
 * 单词边界探索\b
 */
public class DemoRegex3 {
	public static void main(String[] args) {
		//以单词边界切分();
		//以非单词边界切分();
		//java不支持的单词边界();
		String patter3 = "(?m)^d";
		String str = "dafdafaf\r\ndadadada";
		String[] strArr = str.split(patter3);
		for (int i = 0; i < strArr.length; i++) {
			  System.out.println(strArr[i]);
		}
	}

	private static void java不支持的单词边界() {
		String patter3 = "\\<"; // \<  \>
		System.out.println("dad".matches(patter3));
		String[] strArr = "a b  c".split(patter3);
		for (int i = 0; i < strArr.length; i++) {
			  System.out.println(strArr[i]);
		}
	}

	private static void 以非单词边界切分() {
		String patter3 = "\\B";
		String[] strArr = "a b  c".split(patter3);
		for (int i = 0; i < strArr.length; i++) {
			  System.out.println(strArr[i]);
		}
	}

	private static void 以单词边界切分() {
		String patter3 = "\\b";
		String[] strArr = "a b c".split(patter3);
		for (int i = 0; i < strArr.length; i++) {
			  System.out.println(strArr[i]);
		}
	}
}
