package pdd;

import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

public class Question2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		str = str.toLowerCase();
		TreeSet<Character> ts = new TreeSet<Character>();
		for (int i = 0; i < str.length(); ++i) {
			ts.add(str.charAt(i));
		}
		Iterator<Character> it = ts.iterator();
		System.out.println(it.next());
	}

}
