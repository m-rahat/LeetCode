import java.util.*;

public class Minimum_Node_Depth {

	public static void main(String [] args) {
		
	}//main
	
	
    public static int minDepth(TreeNode root) {
        
    	if (root == null) return 0;
    	
    	int depthLeft = minDepth(root.left);
    	int depthRight = minDepth(root.right);
    	
    	return 1 + Math.min(depthLeft, depthRight);
    	
    }//minDepth
	
}//ClassName

