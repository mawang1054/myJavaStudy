package pdd;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Question1 {

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
		Arrays.sort(b);
		for (int j = 0; j < a.length / 2; ++j) {
			int temp = a[j];
			a[j] = a[a.length - 1 - j];
			a[a.length - 1 - j] = temp;
		}
		int num = 0;
		for (int j = 0; j < a.length; ++j) {
			num += a[j]*b[j];
		}
		System.out.println(num);
	}

}
