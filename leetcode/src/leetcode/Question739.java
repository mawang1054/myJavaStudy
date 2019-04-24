package leetcode;

import java.util.Arrays;
import java.util.Stack;

public class Question739 {
    public static int[] dailyTemperatures(int[] T) {
        Stack<Integer> stack = new Stack<Integer>();
        int[] result = new int[T.length];
        
        int i = 0;
        while(i < T.length){
            if(stack.isEmpty() || T[i] <= T[stack.peek()]){
                stack.push(i);
                ++i;
            } else {
                int index = stack.pop();
                result[index] = i - index;                    
            }
        }
        return result;
    }
    
    public static void main(String[] args) {
		int[] t = {89,62,70,58,47,47,46,76,100,70};
		int[] x = dailyTemperatures(t);
		System.out.println(Arrays.toString(x));
	}
}
