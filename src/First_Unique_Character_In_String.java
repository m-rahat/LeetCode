import java.util.*;
import java.util.Map.Entry;

public class First_Unique_Character_In_String {

    public static int firstUniqChar(String s) {
        
    	//"leetcode"
    	Map<Character, Integer> map = new HashMap<>();
    	
    	for (int i = 0; i < s.length(); i++) {
    		if (map.containsKey(s.charAt(i))) {
    			map.put(s.charAt(i), Integer.MAX_VALUE);
    		}//if
    		else {
    			map.put(s.charAt(i), i);
    		}//else
    		
    	}//for
    	
    	System.out.println(map);
    	
    	int result = Integer.MAX_VALUE;
    	
    	for(Map.Entry<Character, Integer> entry : map.entrySet()) {
    		if (entry.getValue() < result) {
    			result = entry.getValue();
    		}
    	}//for
    	
    	if (result == Integer.MAX_VALUE) return -1;
    	
    	return result;
    }//firstUniqChar
	
	public static void main(String [] args) {
		
		System.out.println(firstUniqChar(""));
		
	}//main
}//ClassName
