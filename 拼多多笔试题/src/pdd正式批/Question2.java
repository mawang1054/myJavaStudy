package pdd正式批;

import java.util.Scanner;

public class Question2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			int[] arr = new int[10];
			for(int i = 0; i < 10; ++i)
				arr[i] = sc.nextInt();
			int A = sc.nextInt();
			int B = sc.nextInt();
			if(A > B) {
				int temp = A;
				A = B;
				B = temp;
			}
			StringBuilder sb = new StringBuilder();
			for(int i = 0; i < arr.length; ++i) {
				for(int j = 0; j < arr[i]; ++j)
					sb.append(i);
			}
			String str = sb.toString();
//			System.out.println(str);
			int resultA = 0;
			int resultB = 0;
			int index = 0;
			while(A > 0 || B > 0) {
				if(arr[0] >= A + B)
					break;
				if(A > 0) {
					resultA = resultA * 10 + str.charAt(index) - '0';
					index++;
					A--;
				}
				if(B > 0) {
					resultB = resultB * 10 + str.charAt(index) - '0';
					index++;
					B--;
				}
			}
			System.out.println(resultA * resultB);
		}
	}
}
