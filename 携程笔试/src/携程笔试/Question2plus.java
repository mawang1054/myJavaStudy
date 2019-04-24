package 携程笔试;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Scanner;

public class Question2plus {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			String str = sc.next();
			str = str.substring(1, str.length() - 1);
			String[] strArr = str.split(",");
			ListNode root = ListNode.createList(strArr);
			int k = sc.nextInt();
//			for(int i = 0; i < strArr.length && (i + k) < strArr.length; i += k) {
//				int length = i + k;
//				int mid = (length + i) / 2;
//				for(int j = i; j < mid; ++j) {
//					String temp = strArr[j];
//					strArr[j] = strArr[length - j - 1 + i];
//					strArr[length - j - 1 + i] = temp;
//				}
//			}
			System.out.print("[");
			while(root != null) {	
				System.out.print(root.val);
				if(root.next != null)
					System.out.print(",");
				else
					System.out.print("]");
				root = root.next;
			}
		}
		sc.close();
	}
}

class ListNode{
	String val;
	ListNode next;
	
	ListNode(String val){
		this.val = val;
	}
	
	public static ListNode createList(String[] strArr) {
		if(strArr == null || strArr.length == 0)
			return null;
		
		Map<String, ListNode> map = new HashMap<String, ListNode>();
		for(int i = 0; i < strArr.length; ++i) {
			map.put(strArr[i], new ListNode(strArr[i]));
		}
		ListNode root = new ListNode("null");
		ListNode node = root;
		for(int i = 0; i < strArr.length; ++i) {
			node.next = map.get(strArr[i]);
			node = node.next;
		}
		return root.next; 
	}
}
