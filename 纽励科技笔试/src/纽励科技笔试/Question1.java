package 纽励科技笔试;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Question1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.nextInt();
		while(sc.hasNext()) {
			int n = sc.nextInt();
			Queue<Integer> list = new LinkedList<Integer>();
			for(int i = 1; i <= n; i++) {
				list.add(i);
			}
			while(list.size() > 1) {
				System.out.print(list.poll() + " ");
				list.add(list.poll());
			}
			System.out.print(list.poll());
			System.out.println();
		}
	}
}
