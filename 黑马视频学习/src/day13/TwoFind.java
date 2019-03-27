package day13;

public class TwoFind {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7,8,9,10};
		System.out.println(TwoFind.twoFindIndex(arr, 0));
	}
	
	public static int twoFindIndex(int[] arr, int target) {
		int min = 0;
		int max = arr.length - 1;
		int mid = (min + max) / 2;
		while (arr[mid] != target) {
			if (arr[mid] < target) {
				min = mid + 1;
			}
			else {
				max = mid - 1;
			}
			if(max < min) {
				return -1;
			}
			mid = (min + max) / 2;
		}
		return mid;
	}
}
