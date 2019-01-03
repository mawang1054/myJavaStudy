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
	
	public static void selectionSort(int[] arr) {//ѡ������
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
	
	public static void quickSort(int[] arr,int _left,int _right) {//���������㷨		
        int left = _left;
        int right = _right;
		if (left>=right)
			return;
		int temp = arr[left];
        while(left != right){   //���������߽���ɨ�裬ֱ��left = right
            while(right > left && arr[right] >= temp)  
                 right --;        //��������ɨ�裬�ҵ���һ���Ȼ�׼Ԫ��С��Ԫ��
              arr[left] = arr[right];  //�ҵ�����Ԫ��arr[right]����arr[left]����

            while(left < right && arr[left] <= temp)
                 left ++;         //��������ɨ�裬�ҵ���һ���Ȼ�׼Ԫ�ش��Ԫ��
              arr[right] = arr[left];  //�ҵ�����Ԫ��arr[left]����arr[right]����
        }
        arr[left] = temp;    //��׼Ԫ�ع�λ
        quickSort(arr,_left,left-1);  //�Ի�׼Ԫ����ߵ�Ԫ�ؽ��еݹ�����
        quickSort(arr, right+1,_right);  //�Ի�׼Ԫ���ұߵĽ��еݹ�����
	}
	
	public static int Fibxh(int n,int first,int second) {//ѭ��쳲���������,ʱ�临�Ӷ�O(n)
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
	
	public static int Fibdg(int n) {//�ݹ�쳲���������
		if (n<3) 
			return 1;
		else
			return Fibdg(n-1)+Fibdg(n-2);
	}
}
