package 快手笔试;

import java.util.Scanner;

public class question1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			String str = sc.next();
			String[] strarr = str.split(",");
			int[] arr = new int[strarr.length + 1];
			for(int i = 1; i < arr.length; ++i) {
				if(strarr[i - 1] == "None")
					break;
				arr[i] = Integer.valueOf(strarr[i - 1]);
			}
//			for (int i : arr) {
//				System.out.println(i);
//			}
//			System.out.println(isTree(1, arr));
			if(isTree(1, arr))
				System.out.println("True");
			else
				System.out.println("False");
		}
	}
	
	public static boolean isTree(int index, int[] arr) {
		if(index < 1 || index >= arr.length)
			return true;
		int leftIndex = index * 2;
		int rightIndex = index * 2 + 1;
		if(leftIndex >= arr.length) {
			return true;
		} else if(rightIndex >= arr.length) {
			if(arr[index] > arr[leftIndex]) {
				return true; 
			} else {
				return false;
			}
		} else {
			if(arr[index] > arr[leftIndex] && arr[index] < arr[rightIndex]) {
				return isTree(leftIndex, arr) && isTree(rightIndex, arr);
			} else {
				return false;
			}		
		}
	}
}
