import java.util.*;

//class ListNode {
//	int val;
//	ListNode next;
//
//	ListNode() {
//	}
//
//	ListNode(int val) {
//		this.val = val;
//	}
//
//	ListNode(int val, ListNode next) {
//		this.val = val;
//		this.next = next;
//	}
//	
//	public String toString(){
//		return Integer.toString(val);
//	}//toString
//}

public class Solution {
	public static ListNode reverseBetween(ListNode head, int m, int n) {
		
		ListNode start = head;
		ListNode bottom;
		ListNode top;
		
		int i = 0;
		
		while (head != null) {
			if (i < m || i >n) {
				head = head.next;
				i++;
			}//if
			else {
			bottom = head.next;
			top = head.next.next;
			head.next = head;
			head = top;
			i++;
			}//else
		}//while
		
//		while (start != null) {
//			System.out.println(start);
//			start = start.next;
//		}
		
		return head;
	}//reverseBetween
	
	public static void main (String [] args) {
		
	ListNode head = new ListNode(1);
	head.next = new ListNode(2);
	head.next.next = new ListNode(3);
	head.next.next.next = new ListNode(4);
	head.next.next.next.next = new ListNode(5);
	
	reverseBetween(head, 1, 3);
		
	}//main
	
}//Solution