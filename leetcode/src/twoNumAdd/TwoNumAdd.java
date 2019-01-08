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
		ListNode head1 = addTwoNumbers1(ListNode.creative(nums1),ListNode.creative(nums2));
		ListNode.show(head1);
		System.out.println();
		int[] nums3 = new int[] {9};
		int[] nums4 = new int[] {1,9,9,9,9,9,9,9,9,9};
		ListNode head2 = addTwoNumbers2(ListNode.creative(nums3),ListNode.creative(nums4));
		ListNode.show(head2);
	}
	
	public static ListNode addTwoNumbers2(ListNode l1, ListNode l2) {
		ListNode head = new ListNode(0);
		ListNode curr = head;
		curr.val = (l1.val + l2.val)%10;
		int carry = (l1.val + l2.val)/10;
		while (l1.next != null && l2.next != null) {
			l1 = l1.next;
			l2 = l2.next;
			curr.next = new ListNode((l1.val+l2.val+carry)%10);
			curr = curr.next;
			carry = (l1.val+l2.val+carry)/10;
		}
		if (l1.next == null)
			while (l2.next != null) {
				l2 = l2.next;
				curr.next = new ListNode((l2.val+carry)%10);
				curr = curr.next;
				carry = (l2.val+carry)/10;
			}
		else {
			while (l1.next != null) {
				l1 = l1.next;
				curr.next = new ListNode((l1.val+carry)%10);
				curr = curr.next;
				carry = (l1.val+carry)/10;			
			}
		}
		if (carry != 0) {
			curr.next = new ListNode(carry);
			}
		return head;
	}
	
    public static ListNode addTwoNumbers1(ListNode l1, ListNode l2) {
        int a=0,b=0,x=0,y=0;//错误方法，会发生溢出错误
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
        int result = a+b;
        ListNode head = new ListNode(0);
        ListNode curr = head;    
        if (result == 0){
            curr.next = null;
            return head;
        }
        while (true){
            int i = result % 10;
            int j = result / 10;
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
