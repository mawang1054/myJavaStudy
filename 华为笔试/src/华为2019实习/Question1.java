package 华为2019实习;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class Question1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			int n = sc.nextInt();
			String[] strArr = new String[n];
			for(int i = 0; i < n; ++i) {
				strArr[i] = sc.next();
			}
			Queue<String> queue = new PriorityQueue<String>();
			for(int i = 0; i < n; ++i) {
				String str = strArr[i];
				if(str.length() == 8)
					queue.add(str);
				else if(str.length() < 8) {
					int length = 8 - str.length();
					for(int j = 0; j < length; ++j)
						str = str + "0";
					queue.add(str);
				} else {
					while(str.length() > 8) {
						queue.add(str.substring(0, 8));
						str = str.substring(8);
					}
					int length = 8 - str.length();
					for(int j = 0; j < length; ++j)
						str = str + "0";
					queue.add(str);
				}
			}
			while(!queue.isEmpty()) {
				System.out.print(queue.poll());
				System.out.print(" ");
			}
		}
		sc.close();
	}
}
