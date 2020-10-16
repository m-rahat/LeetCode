import java.util.*;
import java.util.stream.Collectors;

public class Find_Disappeared_Numbers {

	public static void main(String[] args) {

		int[] nums = new int[] { 4, 3, 2, 7, 8, 2, 3, 1};

		System.out.println(findDisappearedNumbers(nums));

	}// main

	public static List<Integer> findDisappearedNumbers(int[] nums) {

		List<Integer> list = new ArrayList<>();
		
		for (int i = 0; i < nums.length; i++) {
			list.add(nums[i]);
		}//for
	
		list = list.stream().distinct().collect(Collectors.toList());
		System.out.println(list);
		
		return list;

	}// findDisappearedNumbers

	public static List<Integer> findDisappearedNumbersV1(int[] nums) {

		List<Integer> list = new ArrayList<>();

		/*
		 * Step 1: start iterating through the list Step 2: put every element in the set
		 * Step 3: loop through all elements in set, and add elements that are not seen
		 * with every iteration Step 4: slow method Step 5: check if it works at the
		 * very least
		 * 
		 */

		Set<Integer> set = new HashSet<>();

		for (int i = 0; i < nums.length; i++) {
			set.add(nums[i]);
		}

		for (int i = 1; i <= nums.length; i++) {
			if (!set.contains(i)) {
				list.add(i);
			}
		} // for

		return list;

	}// findDisappearedNumbers

}// Find_Disappeared_Numbers
