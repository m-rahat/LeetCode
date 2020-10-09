import java.util.*;

public class Remove_Duplicate_Letters {

	public static void main(String[] args) {

		/*
		 * c d a d a b c c 0 1 2 3 4 5 6 7
		 * 
		 * l e e t c o d e leet
		 */

//		String in1 = "";	//with currentIndex
//		String in2 = "";	//with greaterIndex

		// if > 0 then go with in2
		// if < 0 then go with in1
		// if = 0 then go with in1
//		System.out.println(in1.compareTo(in2));

		removeDuplicateLetters("leetcode");

	}// main

	public static String removeDuplicateLetters(String s) {

		String returnString = "";
		String in1 = "";
		String in2 = "";

		char[] input1 = new char[s.length()];
		char[] input2 = new char[s.length()];
		Map<Character, Integer> map1 = new HashMap<>();
		Map<Character, Integer> map2 = new HashMap<>();
		char[] charArray = s.toCharArray();

		for (int i = 0; i < charArray.length; i++) {

			if (map1.containsKey(charArray[i])) {
				int n = map1.get(charArray[i]);
				if (i < n) {
					input1[i] = charArray[i];
					map1.put(charArray[i], i);
				} // if
			} // if
			else {
				input1[i] = charArray[i];
				map1.put(charArray[i], i);
			} // else
			
			// now part 2
			if (map2.containsKey(charArray[i])) {
				int n = map2.get(charArray[i]);
				if (i > n) {
					input2[i] = charArray[i];
					input2[n] = Character.MIN_VALUE;
					map2.put(charArray[i], i);
				} // if
			} // if
			else {
				input2[i] = charArray[i];
				map2.put(charArray[i], i);
			} // else
		
			in1 = new String(input1);
			in2 = new String(input2);
			
			System.out.println(in1 + " in1");
			System.out.println(in2 + " in2");
			
			if(in1.compareTo(in2) > 0){
				input1 = input2;
			}//if
			else if (in1.compareTo(in2) == 0) {
				input2 = input1;
			}//else if
			else {
				input2 = input1;
			}//else
			
			
		} // for
		
		System.out.println(Arrays.toString(input1));
		System.out.println(Arrays.toString(input2));
		
		
		return returnString;
	}// removeDuplicateLetters

}// RemoveDuplicateLetters
