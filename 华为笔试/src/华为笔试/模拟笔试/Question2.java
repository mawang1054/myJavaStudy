package 华为笔试.模拟笔试;

import java.util.Arrays;

public class Question2 {
	public static void main(String[] args) {
		int[] array = {1,0,5,4,6,4,5,53,6,667,76,3,2,1,0};
		Solution.sort(array, array.length);
		System.out.println(Arrays.toString(array));
	}
}

class Main{
	public static void SwapWithZero(int[] array, int len, int n) {
		int zeroIndex = 0;
		for(int i = 0; i < len; ++i) {
			if(array[i] == 0) {
				zeroIndex = i;
				break;
			}
		}
		if(array[zeroIndex] != 0) 
			throw new RuntimeException("数组中不存在0");
		array[zeroIndex] = array[n];
		array[n] = 0;
	}
}

class Solution {
    /**
     * 交换数组里n和0的位置
     * 
     * @param array
     *            数组
     * @param len
     *            数组长度
     * @param n
     *            和0交换的数
     */
    // 不要修改以下函数内容
    public static void swapWithZero(int[] array, int len, int n) {
        Main.SwapWithZero(array, len, n);
    }
    // 不要修改以上函数内容


    /**
     * 通过调用swapWithZero方法来排
     * 
     * @param array
     *            存储有[0,n)的数组
     * @param len
     *            数组长度
     */
    public static void sort(int[] array, int len) {
//    	int x = 0;
//        for(int i = len - 1; i >= 0; --i) {
//        	swapWithZero(array, len, i);
//        	swapWithZero(array, len, maxIndex(array, len - x));
//        	++x;
//        }
    	Arrays.sort(array);
    }
    
    public static int maxIndex(int[] array, int len) {
    	int maxIndex = 0;
    	for(int i = 1; i < len; ++i) {
    		if(array[maxIndex] < array[i])
    			maxIndex = i;
    	}
    	return maxIndex;
    }
}
