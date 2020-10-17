import java.util.*;

public class N_Repeated_Elements_In_Array {

	public static void main(String [] args) {
		
		
		
	}//main
	
	/*
	 * [2,1,2,5,3,2]
	 * output = 2
	 * 
	 * array size is 2N, with N + 1 unique elements
	 * Only one of them will repeat N times. find which one
	 * 
	 * [4, 2, 2, 1 , 4, 5, 12, 1, 1, 5, 9, 4]
	 * 
	 */
	
    public static int repeatedNTimes(int[] A) {
        
    	Set<Integer> set = new HashSet<>();
    	for(int i = 0; i < A.length; i++) {
    		if (set.contains(A[i])) return A[i];
    		set.add(A[i]);
    	}//for
    	return 1;
    }//repeatedNTimes
	
}//class name
