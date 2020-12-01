import java.util.*;

public class Set_Mismatch {

	public static int[] findErrorNums(int[] nums) {

		Set<Integer> set = new HashSet<>();
		for(int i = 0; i < nums.length; i++) {
			set.add(nums[i]);
		}//for
		
	}// findErrorNums

	public static void main(String[] args) {

		int[] nums = { 1, 2, 2, 4 };

		System.out.println(findErrorNums(nums));
	}// main

}// Set_Mismatch
