import java.util.*;

public class Binary_Search {
	
    public static int search(int[] nums, int target) {
        
    	return Arrays.binarySearch(nums, target);
    	
    }//search
    
    public static void main (String [] args) {
    	
    	int[] arr = {1, 2, 3, 4, 5};
    	
    	System.out.println(search(arr, 4));
    	
    }//main
    
}//BinarySearch