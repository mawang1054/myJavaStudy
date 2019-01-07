package twoNumAdd;

class ListNode {
	int val;
	ListNode next;
	
	ListNode(int x) {
		val = x; 
	}
	
	public static void show(ListNode head){
		while(true) {
			System.out.print(head.val);
			if (head.next == null)
				break;
			head = head.next;
		}
	}
	
	public static ListNode creative(int[] nums) {
		ListNode head = new ListNode(0);
		ListNode curr = head;
		for (int i = 0;i < nums.length;++i) {
			curr.val = nums[i];
			if (i != nums.length - 1) {
				curr.next = new ListNode(0);
				curr = curr.next;
			}
			else {
				curr.next = null;
			}
		}
		return head;
	}
}

public class TwoNumAdd {
	public static void main(String[] args) {
		int[] nums1 = new int[] {9};
		int[] nums2 = new int[] {1,9,9,9,9,9,9,9,9,9};
		ListNode head = addTwoNumbers(ListNode.creative(nums1),ListNode.creative(nums2));
		ListNode.show(head);
	}

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        long a=0,b=0,x=0,y=0;//´íÎó·½·¨£¬Òç³ö´íÎó
        if (l1.next == null)
            a = l1.val;
        else{
            while(true){
                a += l1.val*Math.pow(10,x);
                ++x;
                if (l1.next == null)
                    break;
                l1=l1.next;    
            }
        }
        if (l2.next == null)
            b=l2.val;
        else{
            while(true){
                a += l2.val*Math.pow(10,y);
                ++y;
                if (l2.next == null)
                    break;
                l2=l2.next;    
            }
        }
        long result = a+b;
        ListNode head = new ListNode(0);
        ListNode curr = head;    
        if (result == 0){
            curr.next = null;
            return head;
        }
        while (true){
            long i = result % 10;
            long j = result / 10;
            curr.val =(int)i;
            if (j==0){
                curr.next = null;
                return head;
            }
            curr.next = new ListNode(0);
            curr = curr.next;
            result = j;          
        }
    }
}
