import java.util.*;

public class Smaller_NumbersThanCurrent {

	public static void main(String [] args) {
		
	}//main
	
    public int[] smallerNumbersThanCurrent(int[] nums) {
        
    	int count = 0;
    	int[] array = new int[nums.length];
    	
    	for (int i = 0; i < nums.length; i++) {
    		
    		for (int j = i; j < nums.length; j++) {
    			
    			if (nums[j] < nums[i] && j != i) {
    				count++;
    			}//if
    			
    		}//for j
    		
    		array[i] = count;
    		count=0;
    		
    	}//for i
    	
    	return array;
    }//methodName
	
}//SmallerNumbersThaNCurrent
