package com.mawang.search;

import java.util.Arrays;

public class BinarySearch {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7,8,9};
		System.out.println(binarySearch0(arr,0,arr.length, 4));
		//System.out.println(binarySearch(arr, 0, arr.length, 3));
	}
    private static int binarySearch0(int[] a, int fromIndex, int toIndex,
            int key) {
    		int low = fromIndex;
int high = toIndex - 1;

while (low <= high) {
int mid = (low + high) >> 1;
int midVal = a[mid];

if (midVal < key)
low = mid + 1;
else if (midVal > key)
high = mid - 1;
else
return mid; // key found
}
return -(low + 1);  // key not found.
}
	public static int binarySearch(int[] arr, int start, int end, int target) {
		if (start > end)
			return -1;
		
		int mid = (start + end) >> 1;
		int index = 0;
		
		if (target == arr[mid])
			return mid;
		else if(target < arr[mid])
			index = binarySearch(arr, start, mid - 1, target);
		else
			index = binarySearch(arr, mid + 1, end, target);
		
		return index;
	}
}
