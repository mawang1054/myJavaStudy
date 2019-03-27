package swardToOffer;

import org.junit.jupiter.api.Test;

public class Question17 {

	public static void main(String[] args) {
		byte[] arr = create(11);
		while(arrNumberIncrement(arr)) {
			//arrShow(arr);
		}
		arrShow(arr);
	}
	
	@Test
	public void test() {
		byte[] arr = create(2);
		while(arrNumberIncrement(arr)) {
			arrShow(arr);
		}
		arrShow(arr);
	}
	
	public static byte[] create(int n) {
		byte[] arr = new byte[n];
		return arr;
	}
	
	public static void arrShow(byte[] arr) {
		boolean flag = false;
		for(int i = arr.length - 1; i >= 0; --i) {
//			if(arr[i] != 0 || flag) {
//				flag = true;
//				System.out.print(arr[i]);	
//			}
			if(!flag && arr[i] != 0) {
				flag = true;
			}
			if(flag) {
				System.out.print(arr[i]);
			}
		}
		System.out.println();
	}

	public static boolean arrNumberIncrement(byte[] arr) {
		boolean flag = false;
		if(arr[0] == 9) {
			arr[0] = 0;
			flag = true;
		} else {
			++arr[0];
		}
		for (int i = 1; i < arr.length; ++i) {
			if(flag) {
				if(arr[i] == 9) {
					arr[i] = 0;
				} else {
					++arr[i];
					flag = false;
				}
			} else
				break;
		}
		return !flag;
	}
}
