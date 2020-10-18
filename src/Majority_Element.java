import java.util.*;

public class Majority_Element {

	public static void main(String[] args) {

		int[] nums = new int[] { 2, 2, 1, 1, 1, 2, 2 };

		System.out.println(majorityElement(nums));

	}// main

	public static int majorityElement(int[] nums) {

		if (nums.length == 1)
			return nums[0];

		Map<Integer, Integer> map = new HashMap<>();

		for (int i = 0; i < nums.length; i++) {

			if (map.containsKey(nums[i])) {
				int n = map.get(nums[i]);
				map.put(nums[i], n + 1);
			} else {
				map.put(nums[i], 1);
			}

		} // for_i
		
		int result = 0, count = 0;
		
		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
			if (entry.getValue() > count) {
				result = entry.getKey();
				count = entry.getValue();
			}//if
		}//for
		
		return result;
	}// majorityElement

}// MajorityElement
