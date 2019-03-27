package pdd;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class Question1plus {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		int[] a = new int[i];
		int[] b = new int[i];
		for (int j = 0; j < i; ++j) {
			a[j] = sc.nextInt();
		}
		for (int j = 0; j < i; ++j) {
			b[j] = sc.nextInt();
		}
	    Arrays.sort(a);
	    for (int j = 0; j < a.length / 2; ++j) {
			int temp = a[j];
			a[j] = a[a.length - 1 - j];
			a[a.length - 1 - j] = temp;
		}
	    int[] aa = Arrays.copyOf(a, a.length);
		
		TreeMap<Integer, Integer> tm = new TreeMap<Integer, Integer>();
		for (int j = 0; i < b.length; ++j) {
			tm.put(j, b[j]);
		}

		int index = 0;
		Set<Integer> set = tm.keySet();
		for (Integer integer : set) {
			a[integer] = aa[index];
			++index;
		}
		
		int num = 0;
		for (int j = 0; j < a.length; ++j) {
			num += a[j]*b[j];
		}
		System.out.println(num);
	}
}
