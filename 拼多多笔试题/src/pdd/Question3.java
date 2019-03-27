package pdd;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Question3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int d = sc.nextInt();
		int[] index = new int[n];
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		for (int i = 0; i < n; ++i) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			hm.put(a, b);
			index[i] = a;
		}
		Arrays.sort(index);
		int max = 0;
		for (int i = 0; i < index.length - 1; ++i) {
			for (int j = i + 1; j < index.length; ++j) {
				if (index[j] - index[i] >= d) {
					if (hm.get(index[j]) + hm.get(index[i]) > max)
						max = hm.get(index[j]) + hm.get(index[i]);
				}
			}
		}
		System.out.println(max);
	}

}
