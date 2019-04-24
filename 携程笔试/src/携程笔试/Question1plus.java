package 携程笔试;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Question1plus {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			String str = sc.next();
			String[] strArr = str.split(",");
			ListNode root = ListNode.createList(strArr);
			ListNode lowNode = root;
			ListNode highNode = root.next;
			boolean flag = false;
			while(lowNode != null && highNode != null && highNode.next != null) {
				if(lowNode.val == highNode.val) {
					flag = true;
					break;
				}
				lowNode = lowNode.next;
				highNode = highNode.next;
				highNode = highNode.next;
			}
			if(flag)
				System.out.println("true");
			else
				System.out.println("false");
//			int size1 = strArr.length;
//			Set<String> set = new HashSet<String>();
//			for(int i = 0; i < size1; ++i) {
//				set.add(strArr[i]);
//			}
//			if(set.size() != size1)
//				System.out.println("true");
//			else
//				System.out.println("false");
		}
		sc.close();
	}
}

//class ListNode{
//	String val;
//	ListNode next;
//	
//	ListNode(String val){
//		this.val = val;
//	}
//	
//	public static ListNode createList(String[] strArr) {
//		if(strArr == null || strArr.length == 0)
//			return null;
//		
//		Map<String, ListNode> map = new HashMap<String, ListNode>();
//		for(int i = 0; i < strArr.length; ++i) {
//			map.put(strArr[i], new ListNode(strArr[i]));
//		}
//		ListNode root = new ListNode("null");
//		ListNode node = root;
//		for(int i = 0; i < strArr.length; ++i) {
//			node.next = map.get(strArr[i]);
//			node = node.next;
//		}
//		return root.next; 
//	}
//}
