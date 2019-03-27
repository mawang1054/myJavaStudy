package day14;

public class DemoRegexReplace {
	public static void main(String[] args) {
		String str = "����....��...��.Ҫ...ҪҪ...Ҫѧ....ѧѧ..ѧ.��..���.��.��.��.��..��";
		str = str.replaceAll("\\.","");
		System.out.println(str);
		str = str.replaceAll("(.)\\1*", "$1");
		System.out.println(str);
	}
}
