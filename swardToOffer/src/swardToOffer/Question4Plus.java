package swardToOffer;
import java.util.Arrays;
public class Question4Plus {
	public static void main(String[] args) {
		int[] a = {1,3,5,9,20};
		int[] b = {2,7,10,40,50,60,80,100};
		int[] c = Question4Plus.merge(a, b);
		System.out.println(Arrays.toString(c));
	}
	
	public static int[] merge(int[] a,int[] b) {
		if (a == null || b == null || (a.length == 0 && b.length == 0))
			return null;
		int aCount = a.length - 1;
		int bCount = b.length - 1;
		int cCount = a.length + b.length - 1;
		int[] c = new int[cCount + 1];
		while (aCount >= 0 && bCount >= 0) {
			if (a[aCount] <= b[bCount]) {
				c[cCount--] = b[bCount--];
			}
			else {
				c[cCount--] = a[aCount--];
			}
		}
		while (aCount >= 0) {
			c[cCount--] = a[aCount--];
		}
		while (bCount >= 0) {
			c[cCount--] = b[bCount--];
		}
		return c;
	}
}
