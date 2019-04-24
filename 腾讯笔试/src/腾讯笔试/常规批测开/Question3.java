package 腾讯笔试.常规批测开;

import java.util.Scanner;

public class Question3 {
	static int result = Integer.MAX_VALUE;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			int N = sc.nextInt();
			int[] d = new int[N];
			int[] p = new int[N];
			
			for(int i = 0; i < N; ++i) {
				d[i] = sc.nextInt();
			}
			for(int i = 0; i < N; ++i) {
				p[i] = sc.nextInt();
			}
			
			core(0, N, 0, d, p, 0);
			System.out.println(result);
			result = Integer.MAX_VALUE;
		}
		sc.close();
	}
	
	public static void core(int nowIndex, int maxIndex, int nowPower, int[] d, int[] p, int nowPrice) {
		if(nowIndex >= maxIndex) {
			result = result < nowPrice ? result : nowPrice;
			return;
		}
		if(nowPower > d[nowIndex])
			core(nowIndex + 1, maxIndex, nowPower, d, p, nowPrice);
		core(nowIndex + 1, maxIndex, nowPower + d[nowIndex], d, p, nowPrice + p[nowIndex]);
	}
}
