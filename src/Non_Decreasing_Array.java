import java.util.*;

public class Non_Decreasing_Array {

	public static void main(String [] args) {
		
		//3 4 15 3 = true
		//-1 4 2 3 = true
		//4 2 1 = false
		
		int[] nums = {4, 2, 1};
		
//		System.out.println(nonDecreasing(nums));
		
		System.out.println(checkPossibility(nums));
		
	}//main
	
    public static boolean checkPossibility(int[] nums) {
        
    	
    	/*
    	 * Step 1: flip nums[i] to a MAX Value, then check if the array is decreasing or not
    	 * Step 2: if array is decreasing, then iteraate through to the next nums[i] and repeat
    	 */
    	
    	int count = 0;
       	int[] testArray = nums.clone();
    	for (int i = 0; i < nums.length; i++) {
    	
    		testArray = nums.clone();
    		
    		testArray[i] = Integer.MAX_VALUE;
    		if (nonDecreasing(testArray)) {
    			System.out.println("MAX");
    			testArray = nums.clone();
    			count++;
    		}//if
    		
    		testArray = nums.clone();
    		testArray[i] = Integer.MIN_VALUE;
    		if(nonDecreasing(testArray)) {
    			System.out.println("MIN");
    			testArray = nums.clone();
    			count++;
    		}//if
    		
    		
    	}//for
    	
    	System.out.println(count);
    	if (count <= 1) return true;
    	
    	return false;
    }//checkPossibility
    
    public static boolean nonDecreasing(int [] nums) {
    	
    	for (int i = 0; i < nums.length - 1; i++) {
//    		System.out.println(nums[i] + "-" + nums[i+1]);
    		if (nums[i] <= nums[i+1]) {
    			//do nothing
    		}//if
    		else {
    			System.out.print("Returning false because of the following: ");
    			System.out.println(nums[i] + "<=" + nums[i+1]);
    			return false;
    		}//else
    	}//for
    	
    	return true;
    }//nonDecreasing
	
    
}//NonDecreasingArray