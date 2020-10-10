import java.util.*;

public class Contains_Duplicate {

	public static void main(String [] args) {
		
		
	}//main
	
    public boolean containsDuplicate(int[] nums) {
        
    	Set<Integer> set = new HashSet<>();
    	
    	for(int i = 0; i < nums.length; i++) {
    		if (set.contains(nums[i])) {
    			return true;
    		}//if
    		else {
    			set.add(nums[i]);
    		}//else
    	}//for
    	
    	return false;
    	
    }//containsDuplicate
	
}//Contains_Duplicate
