package 腾讯笔试.常规批测开;

import java.util.Arrays;
import java.util.Scanner;

public class Question1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			int temp = 0;
			int nowNumber = 0;
			int sumNumber = 0;
			int m = sc.nextInt();
			int n = sc.nextInt();
			int[] arr = new int[n + 1];
			for(int i = 0; i < n; ++i) {
				arr[i] = sc.nextInt();
			}
			arr[n] = m + 1;
			Arrays.sort(arr);
			if(arr[0] != 1) {
				System.out.println(-1);
				break;
			}
			for(int i = 1; i <= n && arr[i] <= m + 1; ++i) {	
				if(arr[i] - 1 <= nowNumber)
					continue;
				temp = (int) Math.ceil(1.0*(arr[i]-1-nowNumber)/(arr[i-1]));
				sumNumber += temp;
				nowNumber += arr[i - 1] * temp;
			}
			System.out.println(sumNumber);
		}
		sc.close();
	}
}
