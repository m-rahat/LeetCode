import java.math.BigInteger;
import java.util.*;

public class Add_Two_Numbers {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
    	StringBuffer num1 = new StringBuffer();
    	while(l1 != null) {
    		int n = l1.val;
    		num1.append(n);
    		l1 = l1.next;
    	}
    	
    	num1 = num1.reverse();
    	
    	StringBuffer num2 = new StringBuffer();
    	while(l2 != null) {
    		int n = l2.val;
    		num2.append(n);
    		l2 = l2.next;
    	}
    	
    	num2 = num2.reverse();
    	
//    	int n1 = Integer.parseInt(num1.toString());
//    	int n2 = Integer.parseInt(num2.toString());
    
//    	Long lng1 = Long.parseLong(num1.toString());
//    	Long lng2 = Long.parseLong(num2.toString());
    	
    	BigInteger big1 = new BigInteger(num1.toString());
    	BigInteger big2 = new BigInteger(num2.toString());
    	
//    	int ans = n1 + n2;
//    	Long ans = lng1 + lng2;
    	BigInteger ans = big1.add(big2);
    	
//    	String ansString = Integer.toString(ans);
//    	String ansString = Long.toString(ans);
    	String ansString = ans.toString();
    	
    	StringBuffer str = new StringBuffer(ansString);
    	str = str.reverse();
    	
    	String result = str.toString();
    	
    	ListNode node = new ListNode();
    	ListNode root = node;
    	for (int i = 0; i < result.length(); i++) {
    		int n = Character.getNumericValue(result.charAt(i));
    		System.out.println(n);
    		ListNode tempNode = new ListNode(n);
    		node.next = tempNode;
    		node = node.next;
    	}
    	
    	return root.next;
    	
    }//addTwoNumbers
    
    
	public static void main(String []args) {
		
	}//main
}//class
