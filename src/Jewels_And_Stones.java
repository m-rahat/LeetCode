import java.util.*;

/*
 * You're given strings J representing the types of stones that are jewels, and S representing the stones you have.  Each character in S is a type of stone you have.  You want to know how many of the stones you have are also jewels.

The letters in J are guaranteed distinct, and all characters in J and S are letters. Letters are case sensitive, so "a" is considered a different type of stone from "A".

Example 1:

Input: J = "aA", S = "aAAbbbb"
Output: 3
Example 2:

Input: J = "z", S = "ZZ"
Output: 0
Note:

S and J will consist of letters and have length at most 50.
The characters in J are distinct.
 */
public class Jewels_And_Stones {

	public static void main(String [] args) {
		
	}//main
	
    public int numJewelsInStones(String J, String S) {
        
    	/*
    	 * we are doing character matching here. character mapping? maybe. 
    	 * lets try this: put all characters of J into a hashset. 
    	 * note: hashsets do not contain duplicates, and this is good here
    	 * because J is guaranteed to have no duplicates.
    	 * 
    	 * Then, basically just iterate through S, and match characters with j
    	 * 
    	 * Step 1: put all characters of J into hashset
    	 * Step 2: iterate through characters of S, and check if it is in the hashset
    	 * Step 3: if it is in the hashset, count++
    	 * Step 4: return
    	 */
    	
    	int count = 0;
    	Set<Character> set = new HashSet<>();
    	for (int i = 0; i < J.length(); i++) {
    		set.add(J.charAt(i));
    	}//for
    	
    	for (int i = 0; i < S.length(); i++) {
    		if (set.contains(S.charAt(i))) {
    			count++;
    		}//if
    	}//for
    	
    	return count;
    }//numJewelsInStones
	
}//Jewels And Stones
