import java.util.*;

public class Middle_Of_Linked_List {

	public static void main(String[] args) {

	}// main

	/*
	 * I might have to see how many nodes there are in total. so i'll probably need to 
	 * iterate through all the nodes, to see the size of the linked list.
	 * once i have determined the size of the list, i have to find out if it is even or odd
	 * if it is even, then i have to itearate to (n/2)+1 and give the result
	 * 7/2 = 3 , so 4 is the ans
	 * 9/2 = 4, so 5 is the ans
	 * 
	 * [1,2, 3, 4, 5]
	 * output 4
	 */
	public ListNode middleNode(ListNode head) {
		
		int size = 1;
		
		ListNode root = head;
		
		while(head.next != null) {
			size++;
			head = head.next;
		}//while
		
		//the if else statements are redundant and both the same but i'm too lazy to remove them.
		if(size % 2 == 0) {
			for (int i = 0; i < (size/2); i++) {
				root = root.next;
			}//for
		}//if
		else {
			for(int i = 0; i < (size/2); i++) {
				root = root.next;
			}
		}//else
		
		return root;
	}// middleNode

}// MiddleOFLinkedList

