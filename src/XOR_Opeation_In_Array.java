import java.util.*;

public class XOR_Opeation_In_Array {

	public static void main(String [] args) {
		
		int n = 10;
		int start = 5;
		
		System.out.println(xorOperation(n, start));
		
	}//main
	
    public static int xorOperation(int n, int start) {
        
    	/*
    	 * popoulate new array of size n.length
    	 * iterate through teh array
    	 * nums[i] = start + (2 * i)
    	 * keep another array, or operations[]
    	 * on do operations[i] = nums[i]
    	 * on every step, do operations[i + 1] ^ nums[i]
    	 *   	
    	 * op = 0, 2, 6, 0, 8  
    	 *    
    	 *   */
    	
    	int[] nums = new int[n];
    	int[] operations = new int[n];
    	nums[0] = start;
    	operations[0] = start;
    	
    	for (int i = 1; i < nums.length; i++) {
    		nums[i] = start + (2 * i);
    		operations[i] = operations[i - 1] ^ nums[i];
    	}//for
    
    	System.out.println(Arrays.toString(nums));
    	System.out.println(Arrays.toString(operations));
    	
    	return operations[n - 1];
    }//xorOperation
	
}//classname
