package com.mawang.BinaryTree;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

/**
 * @author mawang
 *
 */
public class BinaryTree {
	/**
	 * @param node
	 *  .前序遍历递归算法
	 */
	public static <T> void preOrderDg(BinaryNode<T> node) {
		if (node != null) {
			System.out.println(node);
			preOrderDg(node.getLeft());
			preOrderDg(node.getRight());
		}
	}
	
	public static <T> void midOrderDg(BinaryNode<T> node) {
		if (node != null) {
			midOrderDg(node.getLeft());
			System.out.println(node);
			midOrderDg(node.getRight());
		}
	}
	
	public static <T> void posOrderDg(BinaryNode<T> node) {
		if (node != null) {
			posOrderDg(node.getLeft());
			posOrderDg(node.getRight());
			System.out.println(node);
		}
	}
	
	public static <T> void preOrder(BinaryNode<T> node) {
		Stack<BinaryNode<T>> stack = new Stack<>();
		while(true) {
			while(node != null) {
				System.out.println(node);
				stack.push(node);
				node = node.getLeft();
			}
			if(!stack.empty()){
				node = stack.pop();
				node = node.getRight();
			} 
			else {
				break;
			}	
		}
	}

	
	public static <T> void midOrder(BinaryNode<T> node) {
		Stack<BinaryNode<T>> stack = new Stack<>();
		while(true) {
			while(node != null) {
				stack.push(node);
				node = node.getLeft();
			}
			if(!stack.empty()){
				node = stack.pop();
				System.out.println(node);
				node = node.getRight();
			} 
			else {
				break;
			}	
		}
	}
	
    public static <T> void midOrder1(BinaryNode<T> Node)
    {
        Stack<BinaryNode<T>> stack = new Stack<>();
        while(Node != null || !stack.empty())
        {
            while (Node != null)
            {
                stack.push(Node);
                Node = Node.getLeft();
            }
            if(!stack.empty())
            {
                Node = stack.pop();
                System.out.println(Node + "   ");
                Node = Node.getRight();
            }
        }
    }
    
    public static <T> void posOrder(BinaryNode<T> Node)
    {
        Stack<BinaryNode<T>> stack1 = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();
        while(Node != null || !stack1.empty())
        {
            while (Node != null)
            {
                stack1.push(Node);
                stack2.push(1);
                Node = Node.getLeft();
            }

            while(!stack1.empty() && stack2.peek() == 2)
            {
                stack2.pop();
                System.out.println(stack1.pop());
            }

            if(!stack1.empty())
            {
                stack2.pop();
                stack2.push(2);
                Node = stack1.peek();
                Node = Node.getRight();
            }
        }
    }
    
    public static <T> int yNodeNumber(BinaryNode<T> Node)
    {	
    	int count = 0;
        Stack<BinaryNode<T>> stack = new Stack<>();
        while(Node != null || !stack.empty())
        {
            while (Node != null)
            {
                stack.push(Node);
                Node = Node.getLeft();
            }
            if(!stack.empty())
            {
                Node = stack.pop();
                if (Node.getLeft() == null && Node.getRight() == null)
                	++count;
                Node = Node.getRight();
            }
        }
        return count;
    }
    
    public static <T> int depth(BinaryNode<T> node) {
		if(node == null)
			return 0;
    	return 1 + Integer.max(depth(node.getLeft()), depth(node.getRight()));  	
    }
    
//    public static <T> BinaryNode<T> createTree(T[] arr, int index){
//		if (index >= arr.length)
//			return null;
//    	BinaryNode<T> root = new BinaryNode<>();
//		T t = arr[index];
//    	if(t == "*")
//    		root = null;
//    	else {
//    		root.setData(t);
//	    	root.setLeft(createTree(arr, index + 1));
//	    	root.setRight(createTree());	
//    	}
//    	return root;
//    }
    
    
    /**
     * @return
     */
    public static BinaryNode<Character> createBds(){
    	Stack<BinaryNode<Character>> stack = new Stack<BinaryNode<Character>>();
    	List<BinaryNode<Character>> list = input();
    	for (BinaryNode<Character> node : list) {
			if (!(node.getData().equals('+')|| node.getData().equals('-')|| node.getData().equals('*') || node.getData().equals('/')))
				stack.push(node);
			else {
				BinaryNode<Character> root = node;
				if(stack.empty()){
					System.out.println("输入非法");
					return null;
				}
				BinaryNode<Character> right = stack.pop();
				if(stack.empty()){
					System.out.println("输入非法");
					return null;
				}
				BinaryNode<Character> left = stack.pop();
				root.setLeft(left);
				root.setRight(right);
				stack.push(root);
			}   
    	}
		return stack.pop();
    }
    
    public static List<BinaryNode<Character>> input() {
    	List<BinaryNode<Character>> list = new ArrayList<>();
    	Scanner sc = new Scanner(System.in);
    	String str = new String();
    	while(!sc.hasNext("#")) {
    		str = sc.next();
    		BinaryNode<Character> root = new BinaryNode<Character>(str.charAt(0));
    		list.add(root);
    	}
    	sc.close();
    	return list;
    }
}
