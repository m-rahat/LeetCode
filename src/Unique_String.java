import java.util.*;


public class Unique_String {

	public static int firstUniqChar(String s) {
		
		Map<Character, Integer> map = new HashMap<>();
		
		for (int i = 0; i < s.length(); i++) {
			if (map.containsKey(s.charAt(i))) {
				int n = map.get(s.charAt(i));
				map.put(s.charAt(i), n + 1);
			}//if
			else {
				map.put(s.charAt(i), 1);
			}//else
		}//for

		for (int i = 0; i < s.length(); i++) {
			if (map.get(s.charAt(i)) == 1)
				return i;
		}//for
		
		return -1;
	}//firstUniqueChar
	
	public static void main (String [] args) {
		
		System.out.println("Hello World");
		
		firstUniqChar("loveleetcode");
		
	}//main

}//Unique_String
