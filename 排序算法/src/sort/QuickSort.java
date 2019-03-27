package sort;

import java.util.Arrays;

public class QuickSort {

	public static void main(String[] args) {
		int[] arr = {1,7,2,4,7,5456,45,478,21,2,67,454,454525,11,34,62,3,4,2,1,8,9,19};
		System.out.println(Arrays.toString(arr));
		quickSort(arr, 0, arr.length - 1);
		System.out.println(Arrays.toString(arr));
	}
	
	public static void quickSort(int[] arr, int low, int high) {
		if (low >= high)
			return;
		int i = low;
		int j = high;
		int key = arr[low];
		int temp = 0;
		while(i < j) {
			while(i < j && arr[j] >= key) {
				--j;
			}
			while(i < j && arr[i] <= key) {
				++i;
			}
			temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
		}
		temp = arr[j];
		arr[j] = arr[low];
		arr[low] = temp;
		
		quickSort(arr, low, j - 1);
		quickSort(arr, j + 1, high);
	}
}
