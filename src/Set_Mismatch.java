import java.util.*;

public class Set_Mismatch {

	public static int[] findErrorNums(int[] nums) {

		Arrays.sort(nums);
		System.out.println(Arrays.toString(nums));
		int[] returnArray = new int[2];
		Set<Integer> set = new HashSet<>();
		for (int i = 0; i < nums.length; i++) {
			if (set.contains(nums[i])) {
				System.out.println("here");
				returnArray[0] = nums[i];
				break;
			}//if
			else {
				set.add(nums[i]);
			}//else
		}//for
		
		for (int i = 0; i < nums.length; i++) {
			if (i+1 != nums[i]) {
				returnArray[1] = i+1;
			}//if
		}//for
		
		System.out.println(Arrays.toString(returnArray));
		return returnArray;
	}// findErrorNums

	public static void main(String[] args) {

		int[] nums = { 1,5,3, 2, 2, 7, 6, 4, 8, 9 };

		System.out.println(findErrorNums(nums));
	}// main

}// Set_Mismatch
