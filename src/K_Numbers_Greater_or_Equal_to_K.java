import java.util.*;

public class K_Numbers_Greater_or_Equal_to_K {

	public static int solve(int[] nums) {
		
		if (nums.length == 1) return -1;
		
		int[] freq = new int[nums.length+1];
		
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] < nums.length) {
				freq[nums[i]]++;
			}//if
			else {
				freq[nums.length]++;
			}//else
		}//for
		
		int total = 0;
		
		for (int i = nums.length; i >= 0; i--) {
			total += freq[i];
			if (total >= i) return i;
		}//for
//		System.out.println(Arrays.toString(freq));
		return -1;
	}//solve

	public static void main(String[] args) {

		int[] array1 = { 5, 3, 0, 9 };
		int[] array2 = { 0, 1 };
		int[] array3 = { 2, 0, 0 };
		int[] array4 = { 3, 0, 6, 1, 5 };
//		System.out.println(solve(array1));
//		System.out.println(solve(array2));
//		System.out.println(solve(array3));
		System.out.println(solve(array4));

	}// main

}// Class Name
