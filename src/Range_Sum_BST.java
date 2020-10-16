import java.util.*;

public class Range_Sum_BST {

	public static void main(String[] args) {

	}// main

	public static int rangeSumBST(TreeNode root, int L, int R) {

		int total = 0;
		List<Integer> list = new ArrayList<>();
		total = rangeSumBST(root, L, R, total, list);
		
		for (int i = 0; i < list.size(); i++) {
			total += list.get(i);
		}
		
		return total;
	}//rangeSumBST
	
	public static int rangeSumBST(TreeNode root, int L, int R, int total, List<Integer> list) {

		if (root == null) return 0;
		if (root.val >= L && root.val <= R) {
			list.add(root.val);
//			System.out.println(root.val);
		}//if
		
		rangeSumBST(root.left, L, R, total, list);
		rangeSumBST(root.right, L, R, total, list);
		
		return total;
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
