//Definition for singly-linked list.
class ListNode {
	int val;
	ListNode next;

	ListNode() {
	}//constructor

	ListNode(int val) {
		this.val = val;
	}//constructor

	ListNode(int val, ListNode next) {
		this.val = val;
		this.next = next;
	}//constructor
}//ListNode

public class Odd_Even_Linked_List {

	public ListNode oddEvenList(ListNode head) {
		
		ListNode temp = new ListNode();
		
		while (temp != null) {
			
			temp = head.next;
			head.next = head.next.next;
			temp = head.next.next;
			head.next = temp;
			
		}//while
		
		return head;
	}// oddEvenList
	
	public static void main (String [] args) {
		
		
	}//main

}// Odd_Even_Linked_List


