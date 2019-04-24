package _0415;

import java.util.Scanner;

public class Question1 {
	public static int maxCount = 0;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			int n = sc.nextInt();
			int[] a = new int[n];
			int[] b = new int[n];
			for(int i = 0; i < n; ++i) {
				a[i] = sc.nextInt();
			}
			for(int i = 0; i < n; ++i) {
				b[i] = sc.nextInt();
			}
			boolean[] flag = new boolean[n];
			for(int i = 0; i < n; ++i) {
				core(a, b, 0, i, flag, 0, 0);
			}
			System.out.println(maxCount * 100);
			maxCount = 0;
		}
		sc.close();
	}
	
	public static void core(int[] a, int[] b, int aIndex, int bIndex, boolean[] flag, int count, int winCount) {
		if(count >= a.length) {
			if(winCount > maxCount)
				maxCount = winCount;
			return;
		}
		if(flag[bIndex] == true)
			return;
		if(a[aIndex] > b[bIndex])
			winCount++;
		else if(a[aIndex] < b[bIndex])
			winCount--;
		
		flag[bIndex] = true;
		
		for(int i = 0; i < a.length; ++i) {
			core(a, b, aIndex + 1, i, flag, count + 1, winCount);
		}	
		
		flag[bIndex] = false;
	}
}
