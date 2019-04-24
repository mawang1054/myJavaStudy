package leetcode;

import org.junit.Test;

public class Question5 {
	public static void main(String[] args) {
		String s = "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa";
		System.out.println(s.length());
		System.out.println(longestPalindrome(s));
	}
	
	@Test
	public void test() {
		String s = "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa";
		System.out.println(s.length());
		System.out.println(longestPalindrome(s));
	}
	
    public static String longestPalindrome(String s) {
    	if(s == null)
    		return null;
    	if(s.length() == 0) {
    		return s;
    	}
		StringBuilder sb1 = new StringBuilder(s);
		StringBuilder sb2 = new StringBuilder(s).reverse();
		
//		for(int i = 0; i < s.length();) {
//			if(sb1.charAt(i) == sb2.charAt(i)) {
//				index = i;
//				while(i < s.length() && sb1.charAt(i) == sb2.charAt(i)) {
//					length++;
//					i++;
//				}
//				maxlength = length;
//			} else {
//				i++;
//			}
//
////			if(sb1.charAt(i) == sb2.charAt(i)) {
////				length++;
////			} else {
////				maxlength = maxlength >= length ? maxlength : length;
////				length = 0;
////				index = i - maxlength;
////			}
//		}
//		if(maxlength == 0) {
//			return s.substring(0, 1);
//		}
//    	return s.substring(index, index + maxlength);
		return maxLengthSubstring(sb1, sb2);
    }

	public static String maxLengthSubstring(StringBuilder sb1, StringBuilder sb2) {
		int maxlength = 0;
		int maxIndex = 0;
		sb1:for(int i = 0; i < sb1.length(); ++i) {
			for(int j = 0; j < sb2.length(); ++j) {
				if(sb1.charAt(i) == sb2.charAt(j)) {
					int sb1Index = i;
					int sb2Index = j;
					int index = i;
					int length = 0;
					while(sb1Index < sb1.length() && sb2Index < sb2.length() 
							&& sb1.charAt(sb1Index) == sb2.charAt(sb2Index)) {
						length++;
						sb1Index++;
						sb2Index++;
					}
					if(index + sb2Index == sb1.length() && maxlength < length) {
						maxlength = length;	
						maxIndex = index;
						if(maxlength == sb1.length()) {
							break sb1;
						}
					}
				}
			}
		}
		return sb1.substring(maxIndex, maxIndex + maxlength);
	}

	public static String longestPalindrome2(String s) {
    	if(s == null)
    		return null;
    	if(s.length() == 0) {
    		return s;
    	}
    	boolean[][] dp = new boolean[s.length()][s.length()];
    	int startIndex = 0;
    	int maxLength = 1;
    	for(int i = 0; i < s.length(); ++i) {
    		dp[i][i] = true;
    	}    	
    	for(int i = 0; i < s.length() - 1; ++i) {
    		if(i < s.length() - 1 && s.charAt(i) == s.charAt(i + 1)) {
    			dp[i][i + 1] = true;
    			startIndex = i;
    			maxLength = 2;
    		}	
    	}
    	
    	for(int length = 3; length <= s.length(); ++length) {
    		for(int i = 0; i <= s.length() - length; ++i) {
    			if()
    		}
    	}

	}
}
