import java.util.*;

public class Subsets {

	public static void main(String [] args) {
		
		int[] nums = new int[] {1, 2, 3};
		
		System.out.println(subsets(nums));
		
	}//main
	
    public static List<List<Integer>> subsets(int[] nums) {
        
    	List<List<Integer>> returnList = new ArrayList<>();
    	returnList.add(new ArrayList<>());
    	
    	for (int i = 0; i < nums.length; i++) {
    		List<Integer> l = new ArrayList<>();
    		l.add(nums[i]);
    		returnList.add(l);
    	}//for
    	
    	System.out.println(returnList);
    	
    	return returnList;
    }//subsets
	
}//SubSets
