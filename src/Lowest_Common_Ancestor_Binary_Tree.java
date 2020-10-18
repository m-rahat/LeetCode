import java.util.*;

public class Lowest_Common_Ancestor_Binary_Tree {
	
	static TreeNode ans = new TreeNode();

	public static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
		
		recurseTree(root, p, q);
		return ans;
	}// lowestCommonAncestor
	
	public static boolean recurseTree(TreeNode currentNode, TreeNode p, TreeNode q) {
		
		if (currentNode == null) return false;
		
		boolean left = recurseTree(currentNode.left, p, q);
		boolean right = recurseTree(currentNode.right, p, q);
		
		boolean mid = false;
		
		if (currentNode == p || currentNode == q) {
			mid = true;
		}
		
		if (left == true || right == true) {
			ans = currentNode;
		}
		
		return (left || right || mid);
	}//recurseTree

}// classname

