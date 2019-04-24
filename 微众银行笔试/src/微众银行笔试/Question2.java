package 微众银行笔试;

import java.util.Scanner;

public class Question2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			long n = sc.nextLong();
			int count = 0;
			while (n > 1) {
				if (n%2 == 1) {
					n = 3 * n + 1;
				}else {
					n = n / 2;
				}
				count++;
			}
			System.out.println(count);
		}
		sc.close();
	}
}

//import java.util.Scanner;
//
//public class demo01 {
//	public static void main(String[] args) {
//		Scanner in=new Scanner(System.in);
//		long n=in.nextLong();
//		int count=0;
//		while (n>1) {
//			if (n%2==1) {
//				n=3*n+1;
//			}else {
//				n=n/2;
//			}
//			count++;
//		}
//		System.out.println(count);
//	}
//}