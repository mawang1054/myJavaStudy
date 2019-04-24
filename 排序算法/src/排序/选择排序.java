package 排序;

import java.util.Arrays;

public class 选择排序 {
	public static void main(String[] args) {
		Integer[] arr = {23,442,42,4,25,65,7,88};
		selectSort(arr);
		System.out.println(Arrays.toString(arr));
	}
	public static void selectSort(Integer[] arr) {
		for(int i = 0; i < arr.length; ++i) {
			int minIndex = i;
			for(int j = i + 1; j < arr.length; ++j) {
				if(arr[minIndex] > arr[j])
					minIndex = j;
			}
			int temp = arr[minIndex];
			arr[minIndex] = arr[i];
			arr[i] = temp;
		}
	}
}
