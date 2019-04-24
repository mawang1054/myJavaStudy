package 华为2019实习;

import java.util.Scanner;
import java.util.Stack;

public class Question2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			String str = sc.next();
			Stack<Character> stack = new Stack<>();
			for(int i = 0; i < str.length(); ++i) {
				Character ch = str.charAt(i);
				if(ch != ']' && ch != ')' && ch != '}') {
					stack.push(ch);
				} else {
					StringBuilder sb = new StringBuilder();
					while(stack.peek() != '[' && stack.peek() != '(' && stack.peek() != '{') {
						sb.append(stack.pop());
					}
					sb.reverse();
					stack.pop();
					int n = 0;
					int k = 1;
					while(stack.peek() >= '0' && stack.peek() <= '9') {
						n = n + (stack.pop() - '0') * k;
						k = k * 10;
					}
					String temp = "";
					for(int j = 0; j < n; ++j) {
						temp += sb.toString();
					}
					for(int j = 0; j < temp.length(); ++j) {
						stack.push(temp.charAt(j));
					}
				}
					
			}
			while(!stack.isEmpty()) {
				System.out.print(stack.pop());
			}
			System.out.println();
		}
		sc.close();
	}
}
