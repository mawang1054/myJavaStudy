package day13;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {
	public static void main(String[] args) {
		int[] arr = {24,69,80,424,55};
		BubbleSort.bubbleSort(arr);
		System.out.println(Arrays.toString(arr));
	}
	
	public static void bubbleSort(int[] arr) {
		if (arr == null || arr.length <= 1)
			return;
		for (int i = 1; i < arr.length; ++i) {
			for (int j = 1; j < arr.length - i; ++j) {
				if (arr[j] > arr[j+1]) {
					arr[j] = arr[j] ^ arr[j+1];
					arr[j+1] = arr[j] ^ arr[j+1];
					arr[j] = arr[j] ^ arr[j+1];
				}
			}
		}
		return;
	}
}
