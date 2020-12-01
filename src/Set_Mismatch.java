import java.util.*;

public class Set_Mismatch {

	public static int[] findErrorNums(int[] nums) {

		int[] returnArray = new int[2];
		
		Set<Integer> set1 = new HashSet<>();
		for (int i = 1; i < nums.length+1; i++) {
			set1.add(i);
		}//for
		
		Set<Integer> set2 = new HashSet<>();
		for (int i = 0; i < nums.length; i++) {
			if (set2.contains(nums[i])) {
				returnArray[0] = nums[i];
			}//if
			else {
				set2.add(nums[i]);
			}//else
		}//for
		
		Iterator it = set1.iterator();
		while(it.hasNext()) {
			int n = (int) it.next();
			if (!set2.contains(n)) {
				returnArray[1] = n;
				break;
			}//if
		}//while
		
		System.out.println(Arrays.toString(returnArray));
		
		return returnArray;
	}// findErrorNums

	public static void main(String[] args) {

		int[] nums = { 1,5,3, 2, 2, 7, 6, 4, 8, 9 };

		System.out.println(findErrorNums(nums));
	}// main

}// Set_Mismatch
