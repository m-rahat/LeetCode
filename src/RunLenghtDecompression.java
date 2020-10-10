import java.util.*;

public class RunLenghtDecompression {

	public static void main(String [] args) {
		
		int[] nums = {1, 2, 3, 4};
		System.out.println(decompressRLElist(nums));
		
	}//main
	
    public static int[] decompressRLElist(int[] nums) {
        
    	List<Integer> list = new ArrayList<>();
    	
    	for (int i = 0; i < nums.length; i+=2) {
    		int freq = nums[i];
    		int val = nums[i+1];
    		
    		while(freq > 0) {
    			list.add(val);
    			freq--;
    		}//while
    		
    	}//for
    	
    	nums = list.stream().mapToInt(i -> i).toArray();
    	
    	return nums;
    }//decompressedRLElist
	
}//RunLengthDecompression
