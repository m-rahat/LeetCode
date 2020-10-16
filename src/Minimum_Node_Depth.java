import java.util.*;

public class Minimum_Node_Depth {

	public static void main(String [] args) {
		
	}//main
	
	/*
	 * [2,null,3,null,4,null,5,null,6]
	 * output: 1
	 * expected: 5
	 * 
	 *				2 
	 * 			null	3
	 * 				null	4
	 * 					null	5
	 * 						null	6
	 *				 				
	 */
	
    public static int minDepth(TreeNode root) {
        
    	if (root == null) return 0;
    	
    	int depthLeft = minDepth(root.left);
    	int depthRight = minDepth(root.right);
    	
    	if (depthLeft == 0 || depthRight == 0) {
    		return 1 + depthLeft + depthRight;
    	}
    	
    	return 1 + Math.min(depthLeft, depthRight);
    	
    }//minDepth
	
}//ClassName

