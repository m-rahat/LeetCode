import java.util.*;

public class Range_Sum_BST {

	public static void main(String[] args) {

	}// main

	public static int rangeSumBST(TreeNode root, int L, int R) {

		Integer total = new Integer(0);
		
		rangeSumBST(root, L, R, total);
		
		return total;
	}//rangeSumBST
	
	public static int rangeSumBST(TreeNode root, int L, int R, int total) {

		if (root == null) return 0;
		if (root.val >= L && root.val <= R) {
			total += root.val;
			System.out.println(root.val);
		}//if
		
		rangeSumBST(root.left, L, R, total);
		rangeSumBST(root.right, L, R, total);
		
		return 1;
	}//rangeSumBST

	
	
}// Range_Sum_BST

class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;

	TreeNode() {
	}

	TreeNode(int val) {
		this.val = val;
	}

	TreeNode(int val, TreeNode left, TreeNode right) {
		this.val = val;
		this.left = left;
		this.right = right;
	}
}
