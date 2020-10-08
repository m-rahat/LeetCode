import java.util.*;

/*
 * Given an array of integers nums.

A pair (i,j) is called good if nums[i] == nums[j] and i < j.

Return the number of good pairs.

 

Example 1:

Input: nums = [1,2,3,1,1,3]
Output: 4
Explanation: There are 4 good pairs (0,3), (0,4), (3,4), (2,5) 0-indexed.
Example 2:

Input: nums = [1,1,1,1]
Output: 6
Explanation: Each pair in the array are good.
Example 3:

Input: nums = [1,2,3]
Output: 0
 

Constraints:

1 <= nums.length <= 100
1 <= nums[i] <= 100

 */
public class Number_of_good_pairs {

	public static void main(String [] args) {
		
	}//main
	
    public static int numIdenticalPairs(int[] nums) {
        
    	/*
    	 * There has to be pairs. Do we need 2 pointers or 1? I think we need two loops. 
    	 * here's why:
    	 * Step 1: Run one iterator for index i
    	 * Step 2: Run one iterator for index j
    	 * Step 3: check if nums[i] == nums[j]
    	 * Step 4: if true, check if i < j
    	 * Step 5: if above step is true, then count++, otherwise move on
    	 */
    	
    	int count = 0;
    	for (int i = 0; i < nums.length; i++) {
    		for (int j = i; j < nums.length; j++) {
    			if (nums[i] == nums[j] && i < j) {
    				count++;
    			}//if
    		}//for
    	}//for i
    	
    	return count;
    }//numIdenticalPairs
	
}//ClassName
