import java.util.*;

public class Spit_A_String_Balanced_Strings {

	public static void main(String[] args) {

		String s = "RLRRLLRLRL";
		System.out.println(balancedStringSplit(s));
		
	}// main

	public static int balancedStringSplit(String s) {
		
		if (s == null || s.length() == 0) {
			return 0;
		}//if
		
		int left = 0, right = 0, score = 0;
		for(int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (c == 'L') {
				left++;
			}//if
			else {
				right++;
			}//else
			if (left == right) {
				score++;
			}//if
			
		}//for
		return score;
		
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
