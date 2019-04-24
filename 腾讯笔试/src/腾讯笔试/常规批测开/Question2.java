package 腾讯笔试.常规批测开;

import java.util.Scanner;
import java.util.Stack;

public class Question2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			int n = sc.nextInt();
			String str = sc.next();
			Stack<Character> stack = new Stack<Character>();
			for(int i = 0; i < n; ++i) {
				if(stack.isEmpty()) {
					stack.push(str.charAt(i));
				} else {
					if(stack.peek() != str.charAt(i))
						stack.pop();
					else
						stack.push(str.charAt(i));
				}
			}
			System.out.println(stack.size());
		}
		sc.close();
	}
}
