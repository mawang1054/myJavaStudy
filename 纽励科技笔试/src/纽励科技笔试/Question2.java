package 纽励科技笔试;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Question2 {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		while(sc.hasNext()) {
//			int n = sc.nextInt();
//			Set<String> set = new TreeSet<String>();
//			for(int i = 0; i < n; ++i) {
//				set.add(sc.next());
//			}
//			for (String string : set) {
//				System.out.println(string);
//			}
//		}	
//	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			int n = sc.nextInt();
			Queue<String> queue = new PriorityQueue<>(n);
			for(int i = 0; i < n; ++i) {
				queue.add(sc.next());
			}
			while(!queue.isEmpty()) {
				System.out.println(queue.poll());
			}
		}	
	}
}
