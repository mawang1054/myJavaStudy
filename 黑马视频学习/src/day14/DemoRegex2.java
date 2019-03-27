package day14;

import java.util.Arrays;

public class DemoRegex2 {
	public static void main(String[] args) {
		String str = "91 27 46 38 50";
		String[] strArray = str.split(" ");
		
		int[] arr = new int[strArray.length];
		for (int i = 0; i < strArray.length; i++) {
			arr[i] = Integer.parseInt(strArray[i]);
		}
		
		Arrays.sort(arr);
		
//		for (int i = 0; i < arr.length; i++) {
//			System.out.print(arr[i]);
//			if(i != arr.length - 1) {
//				System.out.print(' ');
//			}
//		}
		
		StringBuffer sb = new StringBuffer();
		
		for (int i = 0; i < arr.length; ++i) {
			sb.append(arr[i]);
			if (i != arr.length - 1) {
				sb.append(" ");
			}
		}
		
		str = sb.toString();
		
		System.out.println(str);
	}
	
}
