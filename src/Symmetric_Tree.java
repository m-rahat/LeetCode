import java.util.*;

public class Symmetric_Tree {

	public static void main(String [] args) {
		
	}//main
	
    public static boolean isSymmetric(TreeNode root) {
        
    	List<Integer> listLeft = new ArrayList<>();
    	List<Integer> listRight = new ArrayList<>();
    	
    	isSymmetric(root.left, listLeft);
    	isSymmetric(root.right, listRight);
    	
    	System.out.println(listLeft.toString());
    	System.out.println(listRight.toString());
    	
    	return true;
    }//isSymmetric
    
    public static void isSymmetric(TreeNode node, List<Integer> list) {
    	
    	if (node == null) return;
    	
    	if (node.left != null) {
    	list.add(node.left.val);
    	}
    	
    	if (node.right != null) {
    	list.add(node.right.val);
    	}
    	
    	isSymmetric(node.left, list);
    	isSymmetric(node.right, list);
    	
    }//isSymmetricOverloaded
    
    
	
}//ClassName
