
public class Rotate_List {

    public ListNode rotateRight(ListNode head, int k) {
        
    	//connect the back of the list to the head of the list.
    	if (head == null) return null;
    	
    	ListNode curr = head;
    	
    	int size = 1;
    	//iterate through list to find the end node
    	while(curr.next != null) {
    		curr = curr.next;
    		size++;
    	}
    	
    	if (size == 1) return head;
    	if (size == k) return head;Ï
    	//connect the end of the node to the head of the node
    	curr.next = head;
    	
    	if (k > size) {
    		k = k % size;
    	}
    	
    	int cuttingPoint = size - k;
    	
    	if (cuttingPoint == 0) return head;
    	
    	curr = head;
    	int j = 1;
    	while(j != cuttingPoint) {
    		j++;
    		curr = curr.next;
    	}
    	head = curr.next;
    	curr.next = null;
    	return head;
    	
    }
	
}
