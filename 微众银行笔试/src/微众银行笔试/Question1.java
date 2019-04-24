package 微众银行笔试;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;


public class Question1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			Queue<Integer> queue = new LinkedList<Integer>();
			for(int i = 0; i < n; ++i) {
				queue.add(i + 1);
			}
			int count = 1;
			while(queue.size() > 1) {
				if(count == m) {
					System.out.print(queue.poll() + " ");
					count = 1;
					continue;
				} else {
					queue.add(queue.poll());
					count++;
				}
			}
			System.out.println();
			System.out.println(queue.poll());
		}
		sc.close();
	}
}

//int n = sc.nextInt();
//int m = sc.nextInt();
//List<Integer> list = new ArrayList<Integer>();
//for(int i = 0; i < n; ++i) {
//	list.add(i + 1);
//}
//int temp = 1;
//int index = 0;
//while(list.size() > 1) {
//	if(temp == m) {
//		System.out.print(list.remove(index));
//		System.out.print(" ");
//		temp = 1;
//	}
//	index++;
//	if(index >= list.size())
//		index = 0;
//	temp++;
//}
//System.out.println();
//System.out.print(list.remove(0));