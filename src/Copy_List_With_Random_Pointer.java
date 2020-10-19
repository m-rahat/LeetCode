import java.util.*;

class Node {
	int val;
	Node next;
	Node random;

	public Node(int val) {
		this.val = val;
		this.next = null;
		this.random = null;
	}// Constructor
}// ClassName

public class Copy_List_With_Random_Pointer {

	public static void main(String[] args) {

	}// main

	public Node copyRandomList(Node head) {
        Map<Node,Node> map = new HashMap<>();
        Node curr = head;
        Node currCopy = new Node(-1); //like a dummy node
        while(curr!=null){
            Node node = new Node(curr.val);
            map.put(curr,node);
            currCopy.next = node;
            currCopy = node;
            curr = curr.next;
        }
        curr = head;
        while(curr!=null){
            if(curr.random!=null){
                map.get(curr).random = map.get(curr.random);
            }
            curr = curr.next;
        }
        return map.get(head);
    }

}// CopyListWithRandomPointer
