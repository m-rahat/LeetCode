import java.util.*;

/*
 * Given a non-negative integer num, return the number of steps to reduce it to zero. If the current number is even, you have to divide it by 2, otherwise, you have to subtract 1 from it.

 

Example 1:

Input: num = 14
Output: 6
Explanation: 
Step 1) 14 is even; divide by 2 and obtain 7. 
Step 2) 7 is odd; subtract 1 and obtain 6.
Step 3) 6 is even; divide by 2 and obtain 3. 
Step 4) 3 is odd; subtract 1 and obtain 2. 
Step 5) 2 is even; divide by 2 and obtain 1. 
Step 6) 1 is odd; subtract 1 and obtain 0.
Example 2:

Input: num = 8
Output: 4
Explanation: 
Step 1) 8 is even; divide by 2 and obtain 4. 
Step 2) 4 is even; divide by 2 and obtain 2. 
Step 3) 2 is even; divide by 2 and obtain 1. 
Step 4) 1 is odd; subtract 1 and obtain 0.
Example 3:

Input: num = 123
Output: 12
 

Constraints:

0 <= num <= 10^6
 */
public class Steps_to_reduce_to_zero {

	public static void main(String [] args) {
		
	}//main
	
    public int numberOfSteps (int num) {
        
    	/*
    	 * if number is even, divide by 2
    	 * if number is odd, subtract 1
    	 * 
    	 * if num == 0, count = 0
    	 * Step1 : run a while loop to check if number == 0 or not
    	 * if num is even, divide by 2, and count++
    	 * if num is odd, subtract by 1, and count ++
    	 */
    	
    	if (num == 0) return 0;
    	
    	int count = 0;
    	
    	while(num != 0) {
    		if (num % 2 == 0) {
    			num /= 2;
    			count++;
    		}//if
    		else {
    			num -= 1;
    			count++;
    		}//else
    	}//while
    	
    	return count;
    }//numberOfSteps
	
}//Steps to reduce to zero
