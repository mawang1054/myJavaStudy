package day18;

import java.util.Scanner;
import java.util.TreeMap;

public class DemoTreeMap1 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		TreeMap<Character, Integer> tm = new TreeMap<Character, Integer>();
		for (int i = 0; i < str.length(); ++i) {
			if (!tm.containsKey(str.charAt(i))) {
				tm.put(str.charAt(i),1);
			}
			else {
				tm.put(str.charAt(i),tm.get(str.charAt(i)) + 1);
			}
		}
		System.out.println(tm);
	}

}
