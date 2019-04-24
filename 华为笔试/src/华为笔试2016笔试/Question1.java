package 华为笔试2016笔试;

import java.util.Scanner;

public class Question1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			int length = sc.nextInt();
			int n = sc.nextInt();
			int[] arr = new int[length + 1];
			for(int i = 1; i <= length; ++i)	{
				arr[i] = sc.nextInt();
			}
			for(int i = 0; i < n; ++i) {
				String str = sc.next();
				int A = sc.nextInt();
				int B = sc.nextInt();
				if(str.equals("Q")) {
					if(A < B)
						System.out.println(maxValue(arr, A, B));
					else
						System.out.println(maxValue(arr, B, A));
				} else {
					arr[A] = B;
				}
			}
		}
		sc.close();
	}
	
	public static int maxValue(int[] arr, int start, int end) {
		int max = arr[start];
		for(int i = start + 1; i <= end; ++i) {
			if(max < arr[i])
				max = arr[i];
		}
		return max;
	}
}
