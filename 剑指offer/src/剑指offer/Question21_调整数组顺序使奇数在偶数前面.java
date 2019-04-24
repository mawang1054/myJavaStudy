package 剑指offer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Question21_调整数组顺序使奇数在偶数前面 {
	public static void main(String[] args) {
		int[] array = {1,2,3,4,5};
		reOrderArray2(array);
		System.out.println(Arrays.toString(array));
	}
	
    public static void reOrderArray1(int[] array) {
        int preIndex = 0;
        int ordIndex = array.length - 1;
        while(preIndex < ordIndex) {
        	while(preIndex < ordIndex && array[preIndex] % 2 == 1)
        		preIndex++;
        	while(preIndex < ordIndex && array[ordIndex] % 2 == 0)
        		ordIndex--;
        	int temp = array[preIndex];
        	array[preIndex] = array[ordIndex];
        	array[ordIndex] = temp;
        }
    }

	public static void reOrderArray2(int[] array) {
		List<Integer> list1 = new ArrayList<Integer>();
		List<Integer> list2 = new ArrayList<Integer>();
		for(int i = 0; i < array.length; ++i) {
			if(array[i] % 2 == 0)
				list2.add(array[i]);
			else
				list1.add(array[i]);
		}
		int j = 0;
		for(int i = 0; i < list1.size(); ++i, ++j) {
			array[j] = list1.get(i);
		}
		for(int i = 0; i < list2.size(); ++i, ++j) {
			array[j] = list2.get(i);
		}
		
	}
}
