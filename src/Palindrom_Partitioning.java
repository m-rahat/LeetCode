import java.util.*;
public class Palindrom_Partitioning {

	public static boolean isPalindrome(String s) {
		
		s = s.replaceAll("[^a-zA-Z0-9]", "");
		s = s.toLowerCase();
		System.out.println(s);

		int end = s.length() - 1;
		for (int i = 0; i < s.length() / 2; i++) {
			if ( ! (s.charAt(i) == s.charAt(end))) {
				return false;
			}//if
			else {
				end--;
			}//else
		}//for
		
		return true;
	}//isPalindrome
	
	public static void main(String [] args) {
		System.out.println(isPalindrome("racecar"));
	}//main
	
}
