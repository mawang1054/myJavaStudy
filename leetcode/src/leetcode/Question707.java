package leetcode;

public class Question707 {
	public static void main(String[] args) {
		MyLinkedList list = new MyLinkedList();
		list.addAtHead(1);
		list.addAtIndex(1, 2);
		System.out.println(list.get(1));
		System.out.println(list.get(0));
		System.out.println(list.get(2));
	}

}

class MyLinkedList {
    int size;
    ListNode head;
    ListNode tail;
    /** Initialize your data structure here. */
    public MyLinkedList() {
    }
    
    /** Get the value of the index-th node in the linked list. If the index is invalid, return -1. */
    public int get(int index) {
        if(index < 0 || index > size - 1)
            return -1;
        ListNode node = head;
        for(int i = 0; i < index; ++i){
            node = node.next;
        }
        return node.val;
    }
    

    
    /** Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list. */
    public void addAtHead(int val) {
        ++size;
        ListNode node = new ListNode(val);
        node.next = head;
        head = node;
        if(size == 1)
            tail = head;
    }
    
    /** Append a node of value val to the last element of the linked list. */
    public void addAtTail(int val) {
        if(size == 0){
            addAtHead(val);
        } else {
            ListNode node = new ListNode(val);
            tail.next = node;
            tail = node;
            ++size;
        }
    }
    
    /** Add a node of value val before the index-th node in the linked list. If index equals to the length of linked list, the node will be appended to the end of linked list. If index is greater than the length, the node will not be inserted. */
    public ListNode getNode(int index) {
        if(index < 0 || index > size - 1)
            return null;
        ListNode node = head;
        for(int i = 0; i < index; ++i){
            node = node.next;
        }
        return node;
    }
    
    public void addAtIndex(int index, int val) {
        if(index < 0 || index > size)
            return;
        if(index == 0)
            addAtHead(val);
        else if(index == size)
            addAtTail(val);
        else {
            ListNode prev = getNode(index - 1);
            ListNode node = new ListNode(val);
            node.next = prev.next;
            prev.next = node;
            ++size;
        }
    }
    
    /** Delete the index-th node in the linked list, if the index is valid. */
    public void deleteAtIndex(int index) {
        if(index < 0 || index >= size)
            return;   
        if(index == 0){
            head = head.next;
            --size;
        } else if(index == size - 1){
            ListNode node = getNode(size - 2);
            tail = node;
            node.next = null;
            --size;
        } else {
            ListNode node = getNode(index - 1);
            node.next = node.next.next;
            --size;
        }
    }
}

class ListNode{
    int val;
    ListNode next;
    ListNode(int val){
        this.val = val;
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */