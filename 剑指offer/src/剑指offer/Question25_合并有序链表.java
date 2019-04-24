package 剑指offer;

public class Question25_合并有序链表 {
    public ListNode Merge(ListNode list1,ListNode list2) {
		ListNode root = new ListNode(-1);
		ListNode node = root;
		while(list1 != null || list2 != null) {
			if(list1 != null && list2 != null) {
				if(list1.val < list2.val) {
					node.next = list1;
					node = node.next;
					list1 = list1.next;
				} else {
					node.next = list2;
					node = node.next;
					list2 = list2.next;
				}
			} else if(list1 == null) {
				node.next = list2;
				break;
			} else {
				node.next = list1;
				break;
			}
		}
    	return root.next;
    }
}	

class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}
