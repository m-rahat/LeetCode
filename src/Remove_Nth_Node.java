import java.util.*;
public class Remove_Nth_Node {

	public static void main(String [] args) {
		
	}//main
	
    public ListNode removeNthFromEnd(ListNode head, int n) {
        
    	ListNode returnNode = head;
    	ListNode node = head;
    	
    	int size = 0;
    	List<ListNode> list = new LinkedList<>();
    	while (node != null) {
    		list.add(node);
    		size++;
    		node = node.next;
    	}//while
    	
    	if (size == 0) return new ListNode();
    	
    	list.remove(size - n);
    	
    	for (int i= 0; i < list.size(); i++) {
    		System.out.println(list.get(i).val);
    	}//for
    	
    	node = returnNode = new ListNode(list.get(0).val);
    	for (int i = 1; i < list.size(); i++) {
    		node.next = new ListNode(list.get(i).val);
    		node = node.next;
    	}//for
    	
    	
    	return returnNode;
    }//removeNthFromEnd
    
}//ClassName
