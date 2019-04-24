package 排序;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortUtil {
	public static void swap(Integer[] arr, int index1, int index2) {
		int temp = arr[index1];
		arr[index1] = arr[index2];
		arr[index2] = temp;
	}
	
	public static Integer[] createArray(int length) {
		List<Integer> list = new ArrayList<Integer>(length);
		for(int i = 0; i < length; ++i) {
			list.add(i);
		}
		Collections.shuffle(list);
		Integer[] arr = new Integer[length];
		return arr = list.toArray(arr);
	}
}
