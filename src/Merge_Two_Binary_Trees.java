import java.util.*;

public class Merge_Two_Binary_Trees {

	public static void main(String [] args0) {
		
	}//main
	
    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {

        
    	if (t1 == null)
    		return t2;
    	if (t2 == null)
    		return t1;
    	
    	t1.val += t2.val;
    	
    	t1.left = mergeTrees(t1.left, t2.left);
    	t1.right = mergeTrees(t1.right, t2.right);
    	
    	return t1;
    	
    }//mergeTrees
	
}//Merge_Binary_Trees

