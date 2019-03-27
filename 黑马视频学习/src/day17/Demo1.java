package day17;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.TreeSet;
import java.util.concurrent.LinkedBlockingDeque;

public class Demo1 {

	public static void main(String[] args) {
		//method1();
		
		//method2();
		
		//method3();
		
		//method4();

		//method5();
	}

	private static void method5() {
		Scanner sc = new Scanner(System.in);
		String str;
		TreeSet<Integer> ts = new TreeSet<Integer>(new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				int num = o1.compareTo(o2);
				return num == 0 ? 1 : -num;
			}
		});
		while(true) {
			str = sc.nextLine();
			if (str.equals("quit"))
				break;
			ts.add(Integer.valueOf(str));
		}
		for (Integer integer : ts) {
			System.out.println(integer);
		}
	}

	private static void method4() {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		sc.close();
		ArrayList<Character> al = new ArrayList<Character>();
		for (int i = 0; i < str.length(); ++i) {
			al.add(str.charAt(i));
		}
		TreeSet<Character> ts = new TreeSet<Character>(new Comparator<Character>() {

			@Override
			public int compare(Character o1, Character o2) {
				int num = o1.compareTo(o2);
				return num == 0 ? 1 : num;
			}
			
		});
		ts.addAll(al);
		al.clear();
		al.addAll(ts);
		StringBuffer sb = new StringBuffer();
		for (Character character : al) {
			sb.append(character);
		}
		str = sb.toString();
		System.out.println(str);
	}

	private static void method3() {
		ArrayList<String> list = new ArrayList<String>();
		list.add("aaa");
		list.add("bbb");
		list.add("ccc");
		list.add("aaa");
		list.add("fffff");
		list.add("dddd");
		list.add("aaa");
		list.add("ccc");
		list.add("bbbb");
		list.add("aaa");
		list.add("bbbb");
		list.add("fffff");
		TreeSet<String> ts = new TreeSet<>(new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				int num = o1.compareTo(o2);
				return num == 0 ? 1 : num;
			}
			
		});
		ts.addAll(list);
		list.clear();
		list.addAll(ts);
		System.out.println(list);
	}

	private static void method2() {
		ArrayList<String> strList = new ArrayList<String>();
		strList.add("a");
		strList.add("b");
		strList.add("c");
		strList.add("c");
		strList.add("a");
		strList.add("d");
		strList.add("f");
		strList.add("b");
		getSingle(strList);
		System.out.println(strList);
	}

	private static void getSingle(ArrayList<String> strList) {
		LinkedHashSet<String> lhs = new LinkedHashSet<String>();
		lhs.addAll(strList);
		strList.clear();
		strList.addAll(lhs);
	}

	private static void method1() {
		Scanner sc = new Scanner(System.in);
		HashSet<Character> hashCharList = new HashSet<Character>();
		String str = sc.nextLine();
		for (int i = 0; i < str.length(); ++i) {
			hashCharList.add(str.charAt(i));
		}
		System.out.println(hashCharList);
	}

}
