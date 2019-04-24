package 腾讯笔试.常规批算法类;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class Question2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			Queue<Integer> queue = new PriorityQueue<Integer>();
			int n = sc.nextInt();
			int k = sc.nextInt();
			int sum = 0;
			for(int i = 0; i < n; ++i) {
				queue.add(sc.nextInt());
			}
			for(int i = 0; i < k; ++i) {
				if(queue.isEmpty()) {
					System.out.print(0);
					System.out.print(" ");
				}else {
					int temp = queue.poll();
					while(!queue.isEmpty() && temp == queue.peek())
						queue.poll();
					temp -= sum;
					System.out.print(temp);
					System.out.print(" ");
					sum += temp;
				}
			}
			System.out.println();
		}
		sc.close();
	}

}
