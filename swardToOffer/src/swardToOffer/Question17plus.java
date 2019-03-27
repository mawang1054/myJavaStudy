package swardToOffer;

import org.junit.Test;

public class Question17plus {
	@Test
	public void test1() {
		String str = plusBignumber("+998", "+222");
		System.out.println(str);
	}
	
	public static String plusBignumber(String str1, String str2) {
		StringBuffer sb = new StringBuffer();
		char[] arr1 = reverse(str1.toCharArray());
		char[] arr2 = reverse(str2.toCharArray());
		int i = 0;
		int c1;
		int c2;
		int count = 0;
		while(i < arr1.length - 1 || i < arr2.length - 1 || count != 0) {
			
			if(i < arr1.length - 1)
				c1 = arr1[i] - '0';
			else
				c1 = 0;
			if(i < arr2.length - 1)
				c2 = arr2[i] - '0';
			else
				c2 = 0;
			
			int c3 = c1 + c2 + count;
			
			if(c3 <= 9) {
				sb.append(c3);
				count = 0;
			}
			else {
				sb.append((char)(c3 % 10 + '0'));
				count = 1;	
			}	
			++i;	
		}
		sb.append('+');
		return sb.reverse().toString();
	}
	
	public static char[] reverse(char[] arr) {
		char temp = 0;
		int length = arr.length;
		for(int i = 0; i < length / 2; ++i) {
			temp = arr[i];
			arr[i] = arr[length - i - 1];
			arr[length - i - 1] = temp;
		}
		return arr;
	}
	
}
