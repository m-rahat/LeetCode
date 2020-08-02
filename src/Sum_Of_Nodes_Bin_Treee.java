import java.util.*;

public class Sum_Of_Nodes_Bin_Treee {

	/*
	 * Given a binary tree, return the sum of values of nodes with even-valued
	 * grandparent. (A grandparent of a node is the parent of its parent, if it
	 * exists.)
	 * 
	 * If there are no nodes with an even-valued grandparent, return 0.
	 */

	// Definition for a binary tree node.
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode() {
		}//TreeNode

		TreeNode(int val) {
			this.val = val;
		}//TreeNode

		TreeNode(int val, TreeNode left, TreeNode right) {
			this.val = val;
			this.left = left;
			this.right = right;
		}//TreeNode
		
	}//TreeNode

	public static int sum = 0;
	
	public int sumEvenGrandparent(TreeNode root) {

		dfs(root, null, null);
		return sum;
		
	}// sumEvenGrandparent

	public void dfs(TreeNode current, TreeNode parent, TreeNode grandParent) {
		
		if (current == null) return;
		if (grandParent != null && grandParent.val % 2 == 0) {
			sum += current.val;
		}//if
		
		dfs(current.left, current, parent);
		dfs(current.right, current, parent);
		
	}//dfs
	
	public static void main(String[] args) {
		System.out.println("Hello World");
	}// main

}// Class name
