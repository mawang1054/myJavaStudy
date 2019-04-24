package 剑指offer;

public class Question24_反转链表 {
    public ListNode ReverseList(ListNode head) {
    	if(head == null || head.next == null)
    		return head;
    	ListNode posNode = head.next;
    	ListNode preNode = head;
    	while(posNode != null) {
    		head.next = posNode.next;
    		posNode.next = preNode;
    		preNode = posNode;
    		posNode = head.next;
    	}
    	return preNode;
    }
}
