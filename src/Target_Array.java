import java.util.*;

public class Target_Array {

	public static void main(String[] args) {

		int[] nums = new int[] { 0, 1, 2, 3, 4 };
		int[] index = new int[] { 0, 1, 2, 2, 1 };
		
		System.out.println(createTargetArray(nums, index));

	}// main

	public static int[] createTargetArray(int[] nums, int[] index) {

		int[] targetArray = new int[index.length];

		/*
		 * left to right, read nums and index read num[i], then check index[i]. put
		 * num[i] into targer[index[i]]
		 */

		List<Integer> list = new ArrayList<>();

		for(int i = 0; i < nums.length; i++) {
			list.add(index[i], nums[i]);
		}//for
		
		for (int i = 0; i < list.size(); i++) {
			targetArray[i] = list.get(i);
		}//for
		
		System.out.println(Arrays.toString(targetArray));
		return targetArray;

	}// createTargetArray

}// Target_Array
