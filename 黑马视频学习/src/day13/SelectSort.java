package day13;

import java.util.Arrays;

public class SelectSort {
	public static void main(String[] args) {
		int[] arr = {24,69,80,424,55};
		SelectSort.selectSort1(arr);
		System.out.println(Arrays.toString(arr));
		System.out.println("----------------------------");
		int[] arr1 = {24,69,80,424,55};
		SelectSort.selectSort2(arr1);
		System.out.println(Arrays.toString(arr1));
	}
	
	public static void selectSort2(int[] arr) {
		if (arr == null || arr.length <= 1)
			return;
		for (int i = 0; i < arr.length - 1; ++i) {
			for (int j = i + 1; j < arr.length; ++j) {
				if (arr[i] > arr[j]) {
					arr[i] = arr[i] ^ arr[j];
					arr[j] = arr[i] ^ arr[j];
					arr[i] = arr[i] ^ arr[j];
				}
			}
		}
	}
	
	public static void selectSort1(int[] arr) {
		if (arr == null || arr.length <= 1)
			return;
		for (int i = arr.length; i > 1; --i) {
			int max = SelectSort.maxIndex(arr, 0, i);
			if(max != i - 1) {
				arr[max] = arr[max] ^ arr[i-1];
				arr[i-1] = arr[max] ^ arr[i-1];
				arr[max] = arr[max] ^ arr[i-1];
			}
		}
		return;
	}
	
	public static int maxIndex(int[] arr, int start, int end) {
		int max = start;
		for (int i = 0; i < end; ++i) {
			if (arr[max] < arr[i]) {
				max = i;
			}
		}
		return max;
	}
}
