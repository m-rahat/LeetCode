import java.util.*;
public class Palindrom_Partitioning {
	
    public static List<List<String>> partition(String s) {
        
    	List<List<String>> returnList = new ArrayList<List<String>>();
    	List<String> list = new ArrayList<>();
    	
    	for (int i = 0; i < s.length(); i++) {
    		for (int j = i; j < s.length(); j++) {
    			if (isPalindrome(s.substring(i, j+1))) {
    				list.add(s.substring(i, j+1));
    			}//if
    		}//for j
    	}//for
    	
    	System.out.println(list);
    	return returnList;
    	
    }//partition

	public static boolean isPalindrome(String s) {
		
		s = s.replaceAll("[^a-zA-Z0-9]", "");
		s = s.toLowerCase();

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
		String s = "abba";
		System.out.println(partition(s));
	}//main
	
}
