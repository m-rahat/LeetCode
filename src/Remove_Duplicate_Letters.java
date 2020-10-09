import java.util.*;

public class Remove_Duplicate_Letters {

	public static void main(String[] args) {

		String input = "cdadabcc";
		String input1 = "abcc";
		System.out.println(removeDuplicateLetters(input));
//		System.out.println(hasAllUniqueLetters(input1));
	}// main

	public static String removeDuplicateLetters(String s) {

		Set<Character> set = new HashSet<>();
		for(int i = 0; i < s.length(); i++) {
			set.add(s.charAt(i));
		}//for
		
		int window = set.size();
		
		Map<String, Integer> map = new HashMap<>();
		for (int i = 0; i < s.length() - window; i++) {
			String substring = s.substring(i);
			map.put(substring, i);
		}//for

		System.out.println(map);
		
		
		return s;
	}// removeDuplicateLetters
		
	public static boolean hasAllUniqueLetters(String st) {
				
		Set<Character> set = new HashSet<>();
		for (int i = 0; i < st.length(); i++) {
			if (set.contains(st.charAt(i))) {
				return false;
			}//if
			else {
				set.add(st.charAt(i));
			}//else
		}//for
		
		return true;
	}//hasAllUniqueLetters

}// RemoveDuplicateLetters
