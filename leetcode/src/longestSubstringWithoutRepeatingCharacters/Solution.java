package longestSubstringWithoutRepeatingCharacters;

import java.util.HashSet;
import java.util.Set;

class Solution {
	public static void main(String[] args) {
		String s ="test";
		int index=lengthOfLongestSubstring3(s);
		System.out.println(index);
	}
    public static int lengthOfLongestSubstring1(String s) {
        int n = s.length();
        int ans=0;
        
        for (int i=0;i<n;i++){
            Set<Character> set = new HashSet<>();
            for (int j=i;j<n;j++){
                Character ch = s.charAt(j);
                if (set.contains(ch)){
                    ans = Math.max(ans,j-i); 
                    break;
                }
                set.add(ch);
            }            
        }
        return ans;
    }
    public static int lengthOfLongestSubstring2(String s) {
        int n = s.length();
        int ans=0;
        int i=0;
        int j=0;
        Set<Character> set = new HashSet<>();
        while (i<n && j<n){
            if (!set.contains(s.charAt(j))){
                set.add(s.charAt(j++));
                ans=Math.max(ans,j-i);
            }
            else
                set.remove(s.charAt(i++));
                
        }
        return ans;
    }
    public static int lengthOfLongestSubstring3(String s) {
        int n = s.length(), ans = 0;
        int[] index = new int[128]; // current index of character
        // try to extend the range [i, j]
        for (int j = 0, i = 0; j < n; j++) {
            i = Math.max(index[s.charAt(j)], i);//���һֱû��������ͬ��ֵ��i��һֱΪ0��ֱ��������
            //��ǰ������ֵ��i����Ϊ�������������
            ans = Math.max(ans, j - i + 1);
            index[s.charAt(j)] = j + 1;//�ڼ��θ�����ֵ����һ�ε���������ֵ��Ϊһ
        }
        return ans;
    }
}