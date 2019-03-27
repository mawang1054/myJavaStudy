package com.mawang.test;

import com.mawang.BinaryTree.BinaryNode;
import com.mawang.BinaryTree.BinaryTree;

import sun.font.CreatedFontTracker;

public class Test {
	public static void main(String[] args) {
		//System.out.println(BinaryTree.yNodeNumber(wqBinaryTree()));
		//System.out.println(BinaryTree.depth(wqBinaryTree()));
		//BinaryTree.preOrder(BinaryTree.createTree());	
		
		BinaryNode<Character> node = BinaryTree.createBds();
		BinaryTree.midOrder(node);
	}
	
	private static BinaryNode<Character> wqBinaryTree(){
		BinaryNode<Character> root = new BinaryNode<>('A');
		
		BinaryNode<Character> left = new BinaryNode<>('B');
		BinaryNode<Character> right = new BinaryNode<>('C');
		root.setLeft(left);
		root.setRight(right);
		
		BinaryNode<Character> left1 = new BinaryNode<>('D');
		BinaryNode<Character> right1 = new BinaryNode<>('E');
		left.setLeft(left1);
		left.setRight(right1);
		
		BinaryNode<Character> left2 = new BinaryNode<>('F');
		BinaryNode<Character> right2 = new BinaryNode<>('G');
		right.setLeft(left2);
		right.setRight(right2);
		
		return root;
	}
}
