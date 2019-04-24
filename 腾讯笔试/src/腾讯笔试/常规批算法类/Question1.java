package 腾讯笔试.常规批算法类;

import java.util.Scanner;

public class Question1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			int n = sc.nextInt();
			int k = sc.nextInt();
			int t1 = n / 2;
			int t2 = n - n / 2;
			int count = 1;
			int c = 1;
			while(t1 > 1 && t2 > 1) {
				if(c < k) {
					c++;
					if(t1 % 2 == 0 && t2 % 2 == 0) {
						t1 = t1 / 2;
						t2 = t2 / 2;
						count++;
					} else {
						if(t1 % 2 == 1) {
							t2 = t1 / 2;
							t1 = t1 - t1 / 2;
							count++;
						} else {
							t1 = t2 / 2;
							t2 = t2 - t2 / 2;
							count++;
						}
					}
				} else {
					break;
				}
			}
			count += Math.max(t1, t2);
			System.out.println(count);
		}
		sc.close();
	}
}
