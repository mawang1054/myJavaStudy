package pdd正式批;

import java.util.Scanner;

public class Question3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			String str = sc.nextLine();
			String[] strArr = str.split(", ");
			strArr[0] = strArr[0].substring(1); 
			strArr[strArr.length - 1] = strArr[strArr.length - 1].substring(0, strArr[strArr.length - 1].length() - 1);		
//			for (String string : strArr) {
//				System.out.println(string);
//			}	
			int d = sc.nextInt();
			int[] arr = new int[strArr.length];
			for(int i = 0; i < arr.length; ++i) {
				arr[i] = Integer.valueOf(strArr[i]);
			}
//			for (int i : arr) {
//				System.out.println(i);
//			}
			double result = 0;
			int length = arr.length * (arr.length - 1) / 2;
			for(int i = 0; i < arr.length - 1; ++i) {
				for(int j = i + 1; j < arr.length; ++j) {
					int temp = arr[i] - arr[j];
					if(temp >= -d && temp <= d)
						result++;
				}
			}
			System.out.println(result / length);
		}
	}
}	
