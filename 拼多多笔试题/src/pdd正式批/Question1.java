package pdd正式批;

import java.util.Arrays;
import java.util.Scanner;

public class Question1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			int n = sc.nextInt();
			int[] arr = new int[n];
			for(int i = 0; i < n; ++i) {
				arr[i] = sc.nextInt();
			}
			int[] result = new int[n / 2];
			Arrays.sort(arr);
			for(int i = 0; i < n / 2; ++i) {
				result[i] = arr[i] + arr[n - 1 - i];
			}
			System.out.println(result[0] - result[n / 2 - 1]);
		}
		sc.close();
	}
}
