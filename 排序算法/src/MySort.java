import java.util.Arrays;

public class MySort{
	public static void main(String args[]) {
		int[] arr= new int[]{9,8,7,6,5,4,3,2,1};
		System.out.println(Arrays.toString(arr));
		selectionSort(arr);
		System.out.println(Arrays.toString(arr));
		int[] arr1= new int[]{9,8,7,6,5,4,3,2,1};
		System.out.println(Arrays.toString(arr1));
		quickSort(arr1,0,arr.length-1);
		System.out.println(Arrays.toString(arr1));
		
		for (int i : arr) {
			System.out.print(Fibxh(i,1,1));
			System.out.print(" ");
		}
		System.out.println();
		
		for (int i : arr) {
			System.out.print(Fibdg(i));
			System.out.print(" ");
		}
		System.out.println();
	}
	
	public static void selectionSort(int[] arr) {//选择排序
		for (int i=0;i<arr.length-1;++i) {
			int minValue=i;
			for (int j=i+1;j<arr.length;++j) {
				if (arr[minValue]>arr[j])
					minValue=j;
			}
			int temp=arr[minValue];
			arr[minValue]=arr[i];
			arr[i]=temp;
		}
	}
	
	public static void quickSort(int[] arr,int _left,int _right) {//快速排序算法		
        int left = _left;
        int right = _right;
		if (left>=right)
			return;
		int temp = arr[left];
        while(left != right){   //从左右两边交替扫描，直到left = right
            while(right > left && arr[right] >= temp)  
                 right --;        //从右往左扫描，找到第一个比基准元素小的元素
              arr[left] = arr[right];  //找到这种元素arr[right]后与arr[left]交换

            while(left < right && arr[left] <= temp)
                 left ++;         //从左往右扫描，找到第一个比基准元素大的元素
              arr[right] = arr[left];  //找到这种元素arr[left]后，与arr[right]交换
        }
        arr[left] = temp;    //基准元素归位
        quickSort(arr,_left,left-1);  //对基准元素左边的元素进行递归排序
        quickSort(arr, right+1,_right);  //对基准元素右边的进行递归排序
	}
	
	public static int Fibxh(int n,int first,int second) {//循环斐波拉契数列,时间复杂度O(n)
		if (n<3) 
			return first;
		while(n>=3) {
			int temp=second;
			second=temp+first;
			first=temp;
			--n;
		}
		return second;
	}
	
	public static int Fibdg(int n) {//递归斐波拉契数列
		if (n<3) 
			return 1;
		else
			return Fibdg(n-1)+Fibdg(n-2);
	}
}
