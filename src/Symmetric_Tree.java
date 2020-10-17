import java.util.*;

public class Symmetric_Tree {

	public static void main(String [] args) {
		
	}//main
	
    public static boolean isSymmetric(TreeNode root) {
        
    	return isSymmetric(root, root);
    }//isSymmetric
    
    public static boolean isSymmetric(TreeNode node1, TreeNode node2) {
    	
    	if (node1 == null && node2 == null) return true;
    	if (node1 == null || node2 == null) return false;
    	
    	return (node1.val == node2.val)
    			&& isSymmetric(node1.left, node2.right)
    			&& isSymmetric(node1.right, node2.left);
    	
    	
    }//isSymmetricOverloaded
    
    
	
}//ClassName
