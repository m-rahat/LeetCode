import java.util.*;

public class Remove_Duplicate_Letters {

	public static void main(String[] args) {


		removeDuplicateLetters("leetcode");

	}// main

	public static String removeDuplicateLetters(String s) {

		if (s== null || s.length() == 0) return "";
		
		HashMap<Character, Integer> map = new HashMap<>();
		//keep a count of how many times the letter appear in a map
		for(int i = 0; i < s.length(); i++) {
			if (! map.containsKey(s.charAt(i))) {
				map.put(s.charAt(i), 1);
			}//if
			else {
				map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
			}//else
		}//for
		
		int pos = 0;
		for (int i = 0; i < s.length(); i++) {
			if(s.charAt(i) < s.charAt(pos)) {
				pos = i;
			}//if
			//decrementing the use of one character from the map
			map.put(s.charAt(i), map.get(s.charAt(i)) - 1);
			if (map.get(s.charAt(i)) == 0) {
				return s.charAt(pos) + removeDuplicateLetters(s.substring(pos + 1).replaceAll(s.charAt(pos) + "", ""));
			}//if
		}//for
		
		
		return s;
	}// removeDuplicateLetters

}// RemoveDuplicateLetters
