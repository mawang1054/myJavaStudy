package 剑指offer;

import java.util.List;

public class Question22_链表倒数第k节点 {
    public ListNode FindKthToTail(ListNode head,int k) {
		if(head == null)
			return null;
		ListNode result = head;
		ListNode node = head;
		int count = 0;
		while(node != null) {
			node = node.next;
			count++;
			if(count > k)
				result = result.next;
			
		}
		if(count >= k)
			return result;
		else
			return null;
    }
}
