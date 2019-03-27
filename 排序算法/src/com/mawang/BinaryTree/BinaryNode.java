package com.mawang.BinaryTree;

public class BinaryNode<T> {
	private T data;
	private BinaryNode<T> left;
	private BinaryNode<T> right;

	public BinaryNode() {
		super();
	}
	
	public BinaryNode(T data){
		super();
		this.setData(data);
	}
	
	public BinaryNode(T data, BinaryNode<T> left, BinaryNode<T> right){
		super();
		this.setData(data);
		this.setLeft(left);
		this.right = right;
	}
	
	@Override
	public String toString() {
		return "BinaryNode [data=" + getData() + "]";
	}

	public BinaryNode<T> getLeft() {
		return left;
	}

	public void setLeft(BinaryNode<T> left) {
		this.left = left;
	}

	public BinaryNode<T> getRight() {
		return right;
	}

	public void setRight(BinaryNode<T> right) {
		this.right = right;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}
	
	
}
