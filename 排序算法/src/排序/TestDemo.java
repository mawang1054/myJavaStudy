package 排序;

import java.util.Arrays;

import org.junit.Test;

public class TestDemo {
	public static int length = 3000000;
	public static Integer[] SortData = SortUtil.createArray(length);
//	@Test
//	public void testInsertSort() {
//		Integer[] arr = Arrays.copyOf(SortData, SortData.length);
//		long startTime = System.currentTimeMillis();
//		插入排序.insertSort(arr);
//		long endTime = System.currentTimeMillis();
//		System.out.println("插入排序(" + length + ")：" + (endTime - startTime) / 1000.0 + "秒");
//		//System.out.println(Arrays.toString(arr));
//	}
	
	@Test
	public void testQuickSort() {
		Integer[] arr = Arrays.copyOf(SortData, SortData.length);
		long startTime = System.currentTimeMillis();
		快速排序.quickSort(arr);
		long endTime = System.currentTimeMillis();
		System.out.println("快速排序(" + length + ")：" + (endTime - startTime) / 1000.0 + "秒");
		//System.out.println(Arrays.toString(arr));
	}
	
	@Test
	public void testShellSort() {
		Integer[] arr = Arrays.copyOf(SortData, SortData.length);
		long startTime = System.currentTimeMillis();
		希尔排序.shellSort(arr);
		long endTime = System.currentTimeMillis();
		System.out.println("希尔排序(" + length + ")：" + (endTime - startTime) / 1000.0 + "秒");
		//System.out.println(Arrays.toString(arr));
	}
	
	@Test
	public void testHeapSort() {
		Integer[] arr = Arrays.copyOf(SortData, SortData.length);
		long startTime = System.currentTimeMillis();
		堆排序.heapSort_o1(arr);
		long endTime = System.currentTimeMillis();
		System.out.println("堆排序(" + length + ")：" + (endTime - startTime) / 1000.0 + "秒");
		//System.out.println(Arrays.toString(arr));
	}
}
