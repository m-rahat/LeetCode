import java.util.*;

public class Spit_A_String_Balanced_Strings {

	public static void main(String[] args) {

		String s = "RLRRLLRLRL";
		System.out.println(balancedStringSplit(s));
		
	}// main

	public static int balancedStringSplit(String s) {

		/*
		 * iterate through the string if balanced, put the balanced string in a hashset
		 * if not balanced, check the next one
		 *
		 * iterate through the string check substring, from i to substring j put result
		 * of isbalanced into dp[][] as dp[i][j] = true means that substring [i][j] is
		 * balanced
		 *
		 * iterater through the string see if substring i,j is in dp array if not,
		 * calculate if substring(i, j) is balanced if balanced, then, put the result in
		 * dp[]i[j] = true and then, put the substring in a hashset
		 *
		 * in the end, return the size of the hashset
		 */
		boolean[][] dp = new boolean[s.length()][s.length()];
		Set<String> set = new HashSet<>();
		
		for (int i = 0; i < s.length(); i++) {
			for (int j = i + 1; j < s.length(); j++) {
				if (dp[i][j] == true) {
					set.add(s.substring(i, j+1));
				}//if
				else {
					boolean result = isBalanced(s.substring(i, j+1));
					if (result == true) {
						dp[i][j] = true;
						set.add(s.substring(i, j+1));
					}//if
				}//else
			}//for j
		}//for i
		
		System.out.println(set);
		return set.size();
	}// balancedStringSplit

	public static boolean isBalanced(String st) {

		int rSize = 0;
		int lSize = 0;

		for (int i = 0; i < st.length(); i++) {
			if (st.charAt(i) == 'R') {
				rSize++;
			} else if (st.charAt(i) == 'L') {
				lSize++;
			} // else if
		} // for

		if (rSize != lSize) return false;
		
		return true;
	}// isBalanced

}// ClassName
