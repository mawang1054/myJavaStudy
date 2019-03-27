package swardToOffer;

import org.junit.Test;

public class Question17Recursion {
	
	@Test
	public void test1() {
		numberPrint(2);
	}
	
	
	public static void arrShow(byte[] arr) {
		boolean flag = false;
		for(int i = arr.length - 1; i >= 0; --i) {
			if(!flag && arr[i] != 0) {
				flag = true;
			}
			if(flag) {
				System.out.print(arr[i]);
			}
		}
		System.out.println();
	}
	
	public static void numberPrint(int n) { 
		byte[] arr = new byte[n];
		recursion(arr,arr.length - 1);
	}
	
	public static void recursion(byte[] arr, int index) {
		if(index == -1) {
			arrShow(arr);
			return;
		}
		
		for(int i = 0; i < 10; ++i) {
			if(index == 0 && i == 0)
				continue;
			arr[index] = (byte) i;
			recursion(arr, index - 1);
		}
	}
}
