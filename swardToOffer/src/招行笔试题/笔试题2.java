package 招行笔试题;

import java.util.Arrays;

import org.junit.Test;

public class 笔试题2 {
	
	@Test
	public void test() {
		int n = 3;
		int k = 4;
		int[] h = {2 , 3, 5};
		qie(n, k, h);
	}
	public static int qie(int n, int k, int[] h) {
		int count = 0;
		int maxval = h.length - 1;
		Arrays.sort(h);
		while(!(h[0] == h[maxval])) {
			
			a:for(int i = k; i > 0; --i) {
				int temp = 0;
				int max = h[maxval] - i;//最高的蛋糕切了之后还剩多少
				for(int j = 0; j < h.length; ++j) {//算出总共被切掉的蛋糕体积数
					temp += h[j] > max ? h[j] - max : 0;
				}
				if(temp <= k) {//判断切掉的蛋糕体积是否符合要求
					for(int j = 0; j < h.length; ++j) {
						h[j] = h[j] > max ? max : h[j];
					}
					break a;
				}
			}
			Arrays.sort(h);
			++count;
		}
		System.out.println(count);
		return count;
	}
}
