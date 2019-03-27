package day12;

import java.util.Scanner;

public class FirstUp {

	public static void main(String[] args) {
		//method1();
		
		//method2();
		
		//method3();
		
		String str = "String的按字典顺序比较两个字符串及案例演示";
		int count = 0;
		String subStr ="字";
		while (str.indexOf(subStr) != -1) {
			++count;
			str = str.substring(str.indexOf(subStr)+subStr.length());
		}
		System.out.println(count);
	}

	private static void method3() {
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		char[] charList = str.toCharArray();
		for (int i = 0; i < charList.length/2; ++i) {
			char temp = charList[i];
			charList[i] = charList[charList.length - 1 - i];
			charList[charList.length - 1 - i] = temp;
		}
		str = new String(charList);
		System.out.println(str);
	}

	private static void method2() {
		int[] array = {1,2,3};
		String str3 = "[";
		for (int i = 0; i < array.length; ++i) {
			str3 += array[i];
			if (i != array.length - 1) {
				str3 += ",";
			}
		}
		str3 += "]";
		System.out.println(str3);
	}

	private static void method1() {
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		String str1 = str.substring(0, 1).toUpperCase();
		String str2 = str.substring(1, str.length()).toLowerCase();
		str = str1 + str2;
		System.out.println(str);
	}
	
	
}
