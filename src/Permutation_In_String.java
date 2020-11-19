import java.util.*;
public class Permutation_In_String {

	
    public static boolean checkInclusion(String s1, String s2) {
        
    	if (s2.length() < s1.length()) return false;
    	
    	if (s2.contains(s1)) return true;
    	
    	Map<Character, Integer> map = new HashMap<>();
    	for (int i = 0; i < s1.length(); i++) {
    		if (map.containsKey(s1.charAt(i))) {
    			int n = map.get(s1.charAt(i));
    			n = n + 1;
    			map.put(s1.charAt(i), n);
    		}//if
    		else {
    			map.put(s1.charAt(i), 1);
    		}
    	}//for
    	
    	int len = 0;
    	Map<Character, Integer> tempMap = map;
    	for (int i = 0; i < s2.length(); i++) {
    		if (tempMap.containsKey(s2.charAt(i))) {
//    			int num = tempMap.get(s2.charAt(i));
//    			if (num < 1) return false;
    			System.out.println(s2.charAt(i));
    			int n = tempMap.get(s2.charAt(i));
    			n = n - 1;
    			tempMap.put(s2.charAt(i), n);
    			len++;
    			if (len == s1.length()) {
    				for (Map.Entry<Character, Integer> entry : tempMap.entrySet()) {
    					if (entry.getValue() > 0) return false;
    				}
    				return true;
    			}//if
    		}//if
    		else {
    			len = 0;
    			tempMap = map;
    		}
    	}//for
    	
    	return false;
    }//checkInclusion
	
	public static void main(String [] args) {
//		System.out.println(checkInclusion("adc", "dcda"));
//		System.out.println(checkInclusion("ab", "eidbaooo"));
		System.out.println(checkInclusion("hello", "ooolleoooleh"));
	}//main
	
}//Permutation in string
