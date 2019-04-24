package 排序;

import java.util.Arrays;

public class 插入排序 {	
	public static void main(String[] args) {
		Integer[] arr = {23,442,42,4,25,65,7,88};
		insertSort(arr);
		System.out.println(Arrays.toString(arr));
	}
	
	public static void insertSort(Integer[] arr) {
		for(int i = 1; i < arr.length; ++i) {
			int j = 0;
			int temp = arr[i];
			for(j = i; j > 0 && arr[j - 1] > temp; --j) {
				arr[j] = arr[j - 1];
			}
			arr[j] = temp; 
		}
	}
}
