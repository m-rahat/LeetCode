import java.util.*;

public class Search_In_Rotated_Sorted_Array_II {
	
    public boolean search(int[] nums, int target) {
        
    	for (int i = 0; i < nums.length; i++) {
    		if (nums[i] == target) return true;
    	}
    	
    	return false;
    }//search

	public static void main(String [] args) {
		
	}//main
	
}//class
