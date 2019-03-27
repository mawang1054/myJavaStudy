package swardToOffer;

import org.junit.Test;

public class Question14 {
	public static void main(String[] args) {
		System.out.println(maxCutDynamic(20));
		System.out.println(maxCutTan(20));
	}
	
	@Test
	public void testMaxCutTan() {
		System.out.println(maxCutTan(1000));
	}
	
	@Test
	public void testmaxCutDynamic() {
		System.out.println(maxCutDynamic(1000));
	}
	
	public static int maxCutTan(int length) {
		if (length < 2)
			return 0;
		if (length < 3) 
			return 1;
		if (length < 4)
			return 2;
		
		int t3 = length / 3;
//		if(length % 3 == 0)
//			return (int) Math.pow(3,t3);
//		else if (length % 3 == 1)
//			return (int) (Math.pow(3, t3) * 4);
//		else
//			return (int) (Math.pow(3, t3) * 2);
		if(length - t3*3==1)
			t3--;
		int t2 = (length-t3*3)/2;
		return ((int)Math.pow(3, t3)*(int)Math.pow(2, t2));
	}

	public static int maxCutDynamic(int length) {
		if (length < 2)
			return 0;
		if (length < 3) 
			return 1;
		if (length < 4)
			return 2;
		
		int max = 0;
		int[] products = new int[length + 1];
		products[0] = 0;
		products[1] = 1;
		products[2] = 2;
		products[3] = 3;
		
		for (int i = 4; i <= length; ++i) {
			max = 0;
			for (int j = 1; j <= i / 2; ++j) {
				int product = products[j] * products[i - j];
				if (max < product)
					max = product;
			}
			products[i] = max;
		}
		return products[length];
	}
}
