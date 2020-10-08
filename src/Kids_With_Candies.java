import java.util.*;

/*
 * Given the array candies and the integer extraCandies, where candies[i] represents the number of candies that the ith kid has.

For each kid check if there is a way to distribute extraCandies among the kids such that he or she can have the greatest number of candies among them. Notice that multiple kids can have the greatest number of candies.

 

Example 1:

Input: candies = [2,3,5,1,3], extraCandies = 3
Output: [true,true,true,false,true] 
Explanation: 
Kid 1 has 2 candies and if he or she receives all extra candies (3) will have 5 candies --- the greatest number of candies among the kids. 
Kid 2 has 3 candies and if he or she receives at least 2 extra candies will have the greatest number of candies among the kids. 
Kid 3 has 5 candies and this is already the greatest number of candies among the kids. 
Kid 4 has 1 candy and even if he or she receives all extra candies will only have 4 candies. 
Kid 5 has 3 candies and if he or she receives at least 2 extra candies will have the greatest number of candies among the kids. 
Example 2:

Input: candies = [4,2,1,1,2], extraCandies = 1
Output: [true,false,false,false,false] 
Explanation: There is only 1 extra candy, therefore only kid 1 will have the greatest number of candies among the kids regardless of who takes the extra candy.
Example 3:

Input: candies = [12,1,12], extraCandies = 10
Output: [true,false,true]
 */

public class Kids_With_Candies {

	public static void main(String[] args) {

	}// main

	public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {

		/*
		 * Step 1: Find out the largest number among the kids Step 2: Give each kid, all
		 * the extra candies, and check if this is larger or equal to the largest amount
		 * of candy one kid has Step 3: If larger or equal to largest, set List index to
		 * true. Otherwise, false. Iterate through the array once, to find out the
		 * largest number first Check with each kid
		 */

		List<Boolean> list = new ArrayList<>();
		int largestNumber = 0;
		for (int i = 0; i < candies.length; i++) {
			if (candies[i] > largestNumber) {
				largestNumber = candies[i];
			} // if
		} // if

		for (int i = 0; i < candies.length; i++) {
			if (candies[i] + extraCandies >= largestNumber) {
				list.add(true);
			}//if
			else {
				list.add(false);
			}//else
		}//for
		
		return list;
	}// kidsWithCandies

}// kids with candies
