package swardToOffer;

public class Question11 {
	public static void main(String[] args) {
		int[] arr = {1,1,0,1,1,1,1};
		System.out.println(Question11.minNumberInRotateArray(arr));
	}
	
    public static int minNumberInRotateArray(int [] array) {
        if (array == null || array.length == 0)
            return 0;
        if (array.length == 1)
            return array[0];
        if (array[0] < array[array.length - 1])
            return array[0];
        int a1 = 0;
        int a2 = array.length - 1;
        int m = (a1 + a2) / 2;
        while (a1 + 1 != a2){
	        if (array[a1] == array[m] && array[a2] == array[m]) {    
	        	return sxSerch(array,a1,a2);
	        }
        	if (array[m] >= array[a1]){
                a1 = m;
                m = (a1 + a2) / 2;
            }
            else{
                a2 = m;
                m = (a1 + a2) / 2;
            }
        }
        return array[a2];
    }

	public static int sxSerch(int[] array, int a1, int a2) {
		int min = array[a1];
		for (int i = a1; i <= a2; ++i) {
			if (min > array[i]) {
				min = array[i];
			}
		}
		return min;
	}
}
