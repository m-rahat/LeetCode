import java.util.*;
public class Search_In_Rotated_Sorted_Array {

    public int search(int[] nums, int target) {
     
    	for (int i = 0; i < nums.length; i++) {
    		if (nums[i] == target) return i;
    	}
    	return -1;
    }
	
}//class
