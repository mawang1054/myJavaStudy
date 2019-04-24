package 排序;

import java.util.Arrays;

public class 希尔排序 {
	public static void main(String[] args) {
		Integer[] arr = {23,442,42,4,25,65,7,88};
		shellSort(arr);
		System.out.println(Arrays.toString(arr));
	}
	
	public static void shellSort(Integer[] arr) {
		for(int increment = arr.length / 2; increment > 0; increment /= 2) {
			for(int i = increment; i < arr.length; ++i) {
				int j = i;
				int temp = arr[i];
				for(; j >= increment && arr[j - increment] > temp; j -= increment) {
					arr[j] = arr[j - increment];
				}
				arr[j] = temp; 
			}
		}
	}
}
