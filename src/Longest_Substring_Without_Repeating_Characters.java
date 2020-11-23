import java.util.*;

public class Longest_Substring_Without_Repeating_Characters {

	
	public static int lengthOfLongestSubstring(String s) {
		
		Set<Character> set = new HashSet<Character>();
		int n = s.length();
		int ans = 0, i = 0, j = 0;
		
		/*
		 * Premise is to use a sliding window. Use hashset
		 * to store the characters in current window. Then we 
		 * slide the index j to the right. if it is not in the 
		 * hashset, we slide j further until s[j] is already in the hashset.
		 * at this point, we found the max size of substrings
		 * without duplicate characters
		 * start with index i. if we do this for all i,
		 * we get our ans
		 */
		while (i < n && j < n) {
			//if set does not contain the char at j
			if (!set.contains(s.charAt(j))) {
				//add the next character to the set
				set.add(s.charAt(j++));
				//answer will be the max length of substring? idk
				ans = Math.max(ans, j-1);
			}//if
			else {
				set.remove(s.charAt(i++));
			}//else
		}//while
		
		
		return 0;
	}//lengthOfLongestSubstring
	
	public static int lengthOfLongestSubstringBrute(String input) {
		String returnString = "";
//put all the chars in a set. set avoids duplication
		
		Set<Character> set = new HashSet<>();
		for (int i = 0; i < input.length(); i++) {
			set.add(input.charAt(i));
		}

		for (int i = 0; i < input.length(); i++) {
			for (int j = i; j < input.length(); j++) {
				if (noDuplicates(input.substring(i, j + 1))) {
					String str = input.substring(i, j + 1);
					if (str.length() > returnString.length()) {
						returnString = str;
					}
				}
			}
		}

		return returnString.length();
	}

	public static boolean noDuplicates(String input) {
		Set<Character> set = new HashSet<>();
		for (int i = 0; i < input.length(); i++) {
			if (set.contains(input.charAt(i)))
				return false;
			else {
				set.add(input.charAt(i));
			}
		}
		return true;
	}

	public static void main(String[] args) {
		
	}// main

}
