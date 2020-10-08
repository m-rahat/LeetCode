import java.util.*;

public class Palindrome {

	public static void main(String [] args) {
		
//		System.out.println(isPalindromeV1("A man, a plan, a canal: Panama"));
		System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
		
	}//main
	
	
	public static boolean isPalindrome(String s) {
		
		s = s.replaceAll("[^a-zA-Z0-9]", "");
		s = s.toLowerCase();
		System.out.println(s);

		ArrayDeque<Character> ad = new ArrayDeque<>();
		for(int i = 0; i < s.length(); i++) {
			ad.push(s.charAt(i));
		}//for
		String reverse = "";
		for (int i = 0; i < s.length(); i++) {
			reverse += ad.pop();
		}//for
		
		if (s.equals(reverse)) {
			return true;
		}
		else {
			return false;
		}
		
	}//isPalindrome
	
	
	public static boolean isPalindromeV1(String s) {
		
		s = s.replaceAll("[^a-zA-Z0-9]*", "");
		s = s.toLowerCase();
		System.out.println(s);
		int end = s.length() - 1;
		for (int i = 0; i < s.length(); i++) {
			
			if (s.charAt(i) == s.charAt(end)) {
				//donothing
				end--;
			}//if
			else {
				return false;
			}
			
		}//for
		
		return true;
	}//isPalindrome
	
}//Palindrome
