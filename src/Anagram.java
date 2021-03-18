import java.util.*;

public class Anagram {

	//reviewed the solution
	public static void main(String [] args) {
		
		
		String s = "anagram";
		String t = "nagaram";
		String p = "tatagram";
		
		isAnagram(s,t);
		
	}//main
	
    public static boolean isAnagram(String s, String t) {
    	
    	if (s == null || t == null) return false;
    	
    	if (s.length() != t.length()) return false;
        
    	Map<Character, Integer> map1 = new HashMap<>();
    	Map<Character, Integer> map2 = new HashMap<>();
    	
    	for (int i = 0; i < s.length(); i++) {
    		if (map1.containsKey(s.charAt(i))) {
    			int count1 = map1.get(s.charAt(i)) + 1;
    			map1.put(s.charAt(i), count1);
    		}//if
    		else {
    			map1.put(s.charAt(i), 1);
    		}//else
    		if (map2.containsKey(t.charAt(i))) {
    			int count2 = map2.get(t.charAt(i)) + 1;
    			map2.put(t.charAt(i), count2);
    		}//if
    		else {
    			map2.put(t.charAt(i), 1);
    		}//else
    	}//for
    	
//    	Map<Character, Integer> map2 = new HashMap<>();
//    	for (int i = 0; i < t.length(); i++) {
//    		if (map2.containsKey(t.charAt(i))) {
//    			int count2 = map2.get(t.charAt(i)) + 1;
//    			map2.put(t.charAt(i), count2);
//    		}//if
//    		else {
//    			map2.put(t.charAt(i), 1);
//    		}//else
//    	}//for
    	
    	System.out.println(map1);
    	System.out.println(map2);
    	if (map1.equals(map2)) {
    		System.out.println(true);
    		return true;
    	}
    	
    	return false;
    }//isAnagram
	
}//Anagram
