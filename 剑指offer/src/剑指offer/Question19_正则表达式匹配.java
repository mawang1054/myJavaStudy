package 剑指offer;

public class Question19_正则表达式匹配 {
	public static void main(String[] args) {
		String s1 = "aaa";
		String s2 = "ab*ac*a";
		char[] str = s1.toCharArray();
		char[] pattern = s2.toCharArray();
		System.out.println(match(str, pattern));
	}
	
    public static boolean match(char[] str, char[] pattern){  
    	int patternIndex = 0;
    	int strIndex = 0;
    	while(patternIndex < pattern.length && strIndex < str.length) {
    		if(patternIndex + 1 < pattern.length && pattern[patternIndex + 1] == '*') {
    			while(str[strIndex] == pattern[patternIndex]) {
    				strIndex++;
    				if(strIndex >= str.length) {
    					break;
    				}
    			}
    			patternIndex += 2;
    		} else if(pattern[patternIndex] == '.') {
    			strIndex++;
    			patternIndex++;
    		} else {
    			if(pattern[patternIndex] == str[strIndex]) {
        			strIndex++;
        			patternIndex++;
    			} else {
    				return false;
    			}
    		}
    	}
    	if(strIndex == str.length && patternIndex == pattern.length)
    		return true;
    	else 
    		return false;
    }
}
