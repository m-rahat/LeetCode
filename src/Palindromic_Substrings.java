import java.util.*;

public class Palindromic_Substrings {

	public static void main(String[] args) {

		String s = "abc";
		
//		System.out.println(isPalindrome(s));
		System.out.println(countSubstrings(s));
		
	}// main


	public static int countSubstrings(String s) {
		
		return 0;
	}// countSubstrings

	
	
	public static boolean isPalindrome(String s) {

		if (s.length() <= 1) return true;
		
		int end = s.length() - 1;

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == s.charAt(end)) {
				end--;
			} // if
			else {
				return false;
			} // else
		} // for

		return true;

	}// isPalindrome
	
	
}// palindromic substring
