package 排序;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Queue;

public class 堆排序 {
	public static void main(String[] args) {
		Integer[] arr = {23,442,42,4,25,65,7,88,1,3};
		for(int i = arr.length / 2 - 1; i >= 0; --i)
			createHeap(arr, i, arr.length);
		System.out.println(Arrays.toString(arr));
	}

	public static void heapSort(Integer[] arr) {
		Queue<Integer> queue = new PriorityQueue<Integer>(arr.length);
		for(int i = 0; i < arr.length; ++i) {
			queue.add(arr[i]);
		}
		for(int i = 0; i < arr.length; ++i) {
			arr[i] = queue.poll();
		}
	}
	
	public static void heapSort_o1(Integer[] arr) {
		for(int i = arr.length / 2 - 1; i >= 0; --i)
			createHeap(arr, i, arr.length);
		for(int i = arr.length - 1; i > 0; --i) {
			SortUtil.swap(arr, i, 0);
			createHeap(arr, 0, i);
		}
	}
	
	public static void createHeap(Integer[] arr, int i, int length) {
		for(int k = i * 2 + 1; k < length; k = k * 2 + 1) {
			if(k + 1 < length && arr[k] < arr[k + 1])
				++k;
			if(arr[k] > arr[i]) {
				SortUtil.swap(arr, k, i);
				i = k;
			} else {
				break;
			}
		}
//        int temp = arr[i];//先取出当前元素i
//        for(int k=i*2+1;k<length;k=k*2+1){//从i结点的左子结点开始，也就是2i+1处开始
//            if(k+1<length && arr[k]<arr[k+1]){//如果左子结点小于右子结点，k指向右子结点
//                k++;
//            }
//            if(arr[k] >temp){//如果子节点大于父节点，将子节点值赋给父节点（不用进行交换）
//                arr[i] = arr[k];
//                i = k;
//            }else{
//                break;
//            }
//        }
//        arr[i] = temp;//将temp值放到最终的位置
	}
}
