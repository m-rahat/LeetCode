import java.util.*;
/*
 * Given an input string, make the computer match the string in the shortest possible time
 */
public class Match_String {

    private static void permute(String str, int l, int r, Set<String> set) 
    { 
        if (l == r) 
//            System.out.println(str); 
        	set.add(str);
        else { 
            for (int i = l; i <= r; i++) { 
                str = swap(str, l, i); 
                permute(str, l + 1, r, set); 
                str = swap(str, l, i); 
            } 
        } 
    } //permute
  
    /** 
     * Swap Characters at position 
     * @param a string value 
     * @param i position 1 
     * @param j position 2 
     * @return swapped string 
     */
    public static String swap(String a, int i, int j) 
    { 
        char temp; 
        char[] charArray = a.toCharArray(); 
        temp = charArray[i]; 
        charArray[i] = charArray[j]; 
        charArray[j] = temp; 
        return String.valueOf(charArray); 
    }//swap 

	
	public static void main(String [] args) {
		
		long start = System.currentTimeMillis();
		String input = "the quick ";

		System.out.println("Input length : " +input.length());
		Set<String> set = new HashSet<>();
		permute(input, 0, input.length()-1, set);
		System.out.println("Set size : " + set.size());
		long end = System.currentTimeMillis();
		System.out.println("Runtime : " +(end-start)/1000);
	
		
	}//main
	
}//class
