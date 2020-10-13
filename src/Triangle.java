import java.util.*;
import java.util.stream.Collectors;

public class Triangle {

	public static void main(String[] args) {

		List<List<Integer>> triangle = new ArrayList<>();
		
		List<Integer> list = new ArrayList<>();
		list.add(2);
		
	}// main

	public static int minimumTotal(List<List<Integer>> triangle) {

		/*
		 * [[-1],[2,3],[1,-1,-3]] out : -2 expected: -1
		 */

		int total = triangle.get(0).get(0);
		int index = 0;

		for (int i = 1; i < triangle.size(); i++) {

			List<Integer> list = triangle.get(i);

			int index1 = index - 1;
			int index2 = index;
			int index3 = index + 1;

			int result1 = Integer.MAX_VALUE;
			int result2 = Integer.MAX_VALUE;
			int result3 = Integer.MAX_VALUE;

			if (list.get(index1) != null) {
				result1 = total += list.get(index1);
			} // if

			if (list.get(index2) != null) {
				result2 = total += list.get(index2);
			} // if

			if (list.get(index3) != null) {
				result3 = total += list.get(index3);
			}

			if (result1 > result2 && result1 > result3) {
				total = result1;
				index = index1;
			} // if
			if (result2 > result1 && result2 > result3) {
				total = result2;
				index = index2;
			} // if
			if (result3 > result1 && result3 > result2) {
				total = result3;
				index = index3;
			} // if

		} // for i

		return total;
	}// minimumTotal


}// Triangle
