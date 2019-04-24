package leetcode;

import java.util.Stack;

public class Question150 {
	public static int evalRPN(String[] tokens) {
        Stack<String> stack = new Stack<>();
        for(int i = 0; i < tokens.length; ++i){
            if(tokens[i] != "+" && tokens[i] != "-" && tokens[i] != "*" && tokens[i] != "/"){
                stack.push(tokens[i]);
            } else {
                if(tokens[i] == "+"){
                    int x = Integer.valueOf(stack.pop());
                    int y = Integer.valueOf(stack.pop());
                    stack.push(String.valueOf(y + x));
                }
                if(tokens[i] == "-"){
                    int x = Integer.valueOf(stack.pop());
                    int y = Integer.valueOf(stack.pop());
                    stack.push(String.valueOf(y - x));
                }
                if(tokens[i] == "*"){
                    int x = Integer.valueOf(stack.pop());
                    int y = Integer.valueOf(stack.pop());
                    stack.push(String.valueOf(y * x));
                }
                if(tokens[i] == "/"){
                    int x = Integer.valueOf(stack.pop());
                    int y = Integer.valueOf(stack.pop());
                    stack.push(String.valueOf(y / x));
                }
            }
        }
        return Integer.valueOf(stack.peek());
    }
	public static void main(String[] args) {
		String[] str = {"10", "6", "9", "3", "+", "-11", "*", "/", "*", "17", "+", "5", "+"};
		System.out.println(evalRPN(str));
	}
}
