package swardToOffer;

public class Question18 {
	
}


class ListNode {
   int val;
   ListNode next = null;

   ListNode(int val) {
       this.val = val;
   }
   
   public static ListNode create(int[] arr) {
	   ListNode head = new ListNode(0);
	   ListNode head1 = head;
	   for(int i = 0; i < arr.length; ++i) {
		   ListNode node = new ListNode(arr[i]);
		   head1.next = node;
		   head1 = node;
	   }
	   return head.next;
   }
}


//   public ListNode deleteDuplication(ListNode pHead){
//       ListNode head = new ListNode(0);
//       head.next = pHead;
//       ListNode node = pHead;
//       ListNode preNode = head;
//       while(node != null){
//           if(node.val != node.next.val){
//               preNode = node;
//               node = node.next;
//           }
//           else{
//               int x = node.val;
//               while(node.val == x){
//                   node = node.next;
//               }
//               preNode.next = node;
//           }
//       }
//       return head.next;
//   }
//}