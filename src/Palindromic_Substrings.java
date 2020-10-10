import java.util.*;

public class Palindromic_Substrings {

	public static void main(String[] args) {

		String s = "a";

//		System.out.println(isPalindrome(s));
		System.out.println(countSubstrings(s));

	}// main

	public static int countSubstrings(String s) {

		/*
		 * Palindrome if: 1: Single Character 2: Two Characters - both same 3: If length
		 * > 2, then s[first] === s[last] and the substring between the first and last
		 * character is a palindrome
		 */

		boolean[][] used = new boolean[s.length()][s.length()];

		for (int i = 0; i < used.length; i++) {

			for (int j = i; j < used[i].length; j++) {

				if (used[i][j] == true) {
					continue;
				} // if

				if (isPalindrome(s.substring(i, j + 1))) {
//					System.out.println(s.substring(i, j + 1));
					used[i][j] = true;
				} // if

			} // for

		} // for i

//		System.out.println("*******************");
		int count = 0;

		for (int i = 0; i < used.length; i++) {

			for (int j = i; j < used[i].length; j++) {

				if (used[i][j] == true) {
//					System.out.println(s.substring(i, j+1));
					count++;
				}

			} // for j

		} // for i

		return count;
	}// countSubstrings

	public static boolean isPalindrome(String s) {

		if (s.length() <= 1)
			return true;

		if (s.length() == 2) {
			if (s.charAt(0) == s.charAt(1)) {
				return true;
			} // if
			else {
				return false;
			} // else
		} // if

		if (s.length() > 2) {

			int end = s.length() - 1;

			for (int i = 0; i < s.length(); i++) {
				if (s.charAt(i) == s.charAt(end)) {
					end--;
				} // if
				else {
					return false;
				} // else
			} // for

		} // if

		return true;

	}// isPalindrome

}// palindromic substring
