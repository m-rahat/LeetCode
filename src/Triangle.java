import java.util.*;
import java.util.stream.Collectors;

public class Triangle {
	
	///Does not work

	public static void main(String[] args) {

		List<List<Integer>> triangle = new ArrayList<>();
		
//		List<Integer> list = new ArrayList<>();
//		list.add(2);
//		
//		List<Integer> list2 = new ArrayList<>();
//		list2.add(3);
//		list2.add(4);
//		
//		List<Integer> list3 = new ArrayList<>();
//		list3.add(6);
//		list3.add(5);
//		list3.add(7);
//		
//		List<Integer> list4 = new ArrayList<>();
//		list4.add(4);
//		list4.add(1);
//		list4.add(8);
//		list4.add(3);
//		
//		triangle.add(list);
//		triangle.add(list2);
//		triangle.add(list3);
//		triangle.add(list4);
		
		List<Integer> list = new ArrayList<>();
		list.add(-1);
		
		List<Integer> list2 = new ArrayList<>();
		list2.add(2);
		list2.add(3);
		
		List<Integer> list3 = new ArrayList<>();
		list3.add(1);
		list3.add(-1);
		list3.add(-3);
		
		triangle.add(list);
		triangle.add(list2);
		triangle.add(list3);
		
		
		System.out.println(minimumTotal(triangle));
		
	}// main

	private static char[] minimumTotal(List<List<Integer>> triangle) {
		
		
		return null;
	}//minimumTotal

//	public static int minimumTotal(List<List<Integer>> triangle) {
//
//		/*
//		 * [[-1],[2,3],[1,-1,-3]] out : -2 expected: -1
//		 */
//
//		int total = triangle.get(0).get(0);
//		int index = 0;
//
//		for (int i = 1; i < triangle.size(); i++) {
//
//			List<Integer> list = triangle.get(i);
//
//			int index1 = index - 1;
//			int index2 = index;
//			int index3 = index + 1;
//
//			int result1 = Integer.MAX_VALUE;
//			int result2 = Integer.MAX_VALUE;
//			int result3 = Integer.MAX_VALUE;
//		
//			try {
//				result1 = total + list.get(index1);
//			}catch(Exception e) {}
//		
//			try {
//				result2 = total + list.get(index2);
//			}catch(Exception e) {}
//			
//			try {
//				result3 = total + list.get(index3);
//			}catch(Exception e) {}
//			
//			if (result1 < result2 && result1 < result3) {
//				total = result1;
//				index = index1;
//			} // if
//			if (result2 < result1 && result2 < result3) {
//				total = result2;
//				index = index2;
//			} // if
//			if (result3 < result1 && result3 < result2) {
//				total = result3;
//				index = index3;
//			} // if
//
//		} // for i
//
//		return total;
//	}// minimumTotal


}// Triangle
