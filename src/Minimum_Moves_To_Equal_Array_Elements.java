import java.util.*;

public class Minimum_Moves_To_Equal_Array_Elements {

	public static void main(String [] args) {
		
		int[] nums = new int[] {3, 2, 1};
		
		System.out.println(minMoves2(nums));
		
	}//main
	
	
    public static int minMoves2(int[] nums) {
        
    	Arrays.sort(nums);
//    	System.out.println(Arrays.toString(nums));
    	
    	int total = 0;
    	
    	int mid = nums[nums.length / 2];
    	
    	for (int i = 0; i < nums.length; i++) {
    		total += Math.abs(nums[i] - mid);
    	}//for
    	
    	return total;
    }//minMoves2
	
}//classname
