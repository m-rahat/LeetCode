import java.util.*;

public class Two_Sum {

	public static void main(String[] args) {

		int[] nums = { 3, 2, 4};

//		System.out.println(twoSum(nums, 9));

		twoSum(nums, 6);
		
	}// main

	public static int[] twoSum(int[] nums, int target) {
		
		for (int i = 0; i < nums.length - 1; i++) {
			
			for (int j = i+1; j < nums.length; j++) {
				
				if (nums[i] + nums[j] == target) {
					int[] numArray = {i, j};
					System.out.println(numArray);
					return numArray;
				}//if
			}//for
			
		}//for

		return nums;
	}// twoSum

}// Two_Sum


//if (nums[i] + nums[i+1] == target) {
//	System.out.println(nums[i] + nums[i+1]);
//	int[] numArray = {i, i+1};
//	return numArray;
//}//if