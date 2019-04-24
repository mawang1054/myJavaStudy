package 华为笔试题;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class Question2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			String str = sc.next();
			LinkedHashSet<Character> ts = new LinkedHashSet<Character>();
			char[] ch = str.toCharArray();
			for (char c : ch) {
				ts.add(c);
			}
			for (char c : ts) {
				System.out.print(c);
			}
			System.out.println();
		}
	}
}