package 排序;

import java.util.Arrays;

public class 快速排序 {
	public static void main(String[] args) {
		Integer[] arr = {23,442,42,4,25,65,7,88};
		quickSort(arr);
		System.out.println(Arrays.toString(arr));
	}
	
	public static void quickSort(Integer[] arr) {
		quickSortCore(arr, 0, arr.length - 1);
	}
	
	public static void quickSortCore(Integer[] arr, int low, int high) {
		if(low >= high)
			return;
		int i = low;
		int j = high;
		median3(arr, low, high);
		int key = arr[low];
		while(i < j) {
			while(i < j && arr[j] >= key)
				--j;
			while(i < j && arr[i] <= key)
				++i;
			SortUtil.swap(arr, i, j);
		}
		SortUtil.swap(arr, i, low);
		quickSortCore(arr, low, i - 1);
		quickSortCore(arr, i + 1, high);
	}
	
	public static void median3(Integer[] arr, int low, int high) {
		int mid = (low + high) / 2;
		if(arr[low] > arr[mid])
			SortUtil.swap(arr, low, mid);
		if(arr[mid] > arr[high])
			SortUtil.swap(arr, mid, high);
		if(arr[low] > arr[mid])
			SortUtil.swap(arr, low, mid);
		SortUtil.swap(arr, mid, low);
	}
}
