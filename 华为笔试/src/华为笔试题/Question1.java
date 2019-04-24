package 华为笔试题;

import java.util.Queue;
import java.util.Scanner;
import java.util.concurrent.ArrayBlockingQueue;

public class Question1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int index = -1;
		while(sc.hasNext()) {
			int length = sc.nextInt();
			Queue<Integer> aq = new ArrayBlockingQueue<Integer>(length);
			for(int i = 0; i < length; ++i) {
				aq.add(i);
			}
			while(!aq.isEmpty()) {
				for(int i = 0; i < 3; ++i) {
					if(i == 2)
						index = aq.poll();
					else
						aq.add(aq.poll());
				}
			}
		}
		System.out.println(index);
	}
}
