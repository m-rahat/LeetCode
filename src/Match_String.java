import java.util.*;
/*
 * Given an input string, make the computer match the string in the shortest possible time
 */
public class Match_String extends Thread{

    private static void permute(String str, int l, int r, Set<String> set, int factorial) 
    { 
        if (l == r) {
//            System.out.println(str); 
        	if (set.size() == factorial) return;
        	set.add(str);
        }
        else { 
            for (int i = l; i <= r; i++) { 
                str = swap(str, l, i); 
                permute(str, l + 1, r, set, factorial); 
                str = swap(str, l, i); 
            } 
        } 
    } //permute
  
    public static String swap(String a, int i, int j) 
    { 
        char temp; 
        char[] charArray = a.toCharArray(); 
        temp = charArray[i]; 
        charArray[i] = charArray[j]; 
        charArray[j] = temp; 
        return String.valueOf(charArray); 
    }//swap 

    public static int factorial(int n) {
    	
    }//factorial
    
    public void run() {
    	
    }//run
	
	public static void main(String [] args) {
		
		long start = System.currentTimeMillis();
		
		String input = "thequickbr";
		System.out.println("Input length : " +input.length());
		Set<String> set = new HashSet<>();
		
		int factorial = 
		
		permute(input, 0, input.length()-1, set, 3628800);
		System.out.println("Set size : " + set.size());
		long end = System.currentTimeMillis();
		System.out.println("Runtime : " +(end-start)/1000);
	
		
		
	}//main
	
}//class
