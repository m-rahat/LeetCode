import java.util.*;

public class Permutation_In_String {

	public static boolean checkInclusion(String s1, String s2) {
		
		for (int i = 0; i < s1.length(); i++) {
			
		}
		
		return true;
		
	}// checkInclusion

	public static String swap(String s, int i0, int i1) {
		if (i0 == i1)
			return s;
		String s1 = s.substring(0, i0);
		String s2 = s.substring(i0 + 1, i1);
		String s3 = s.substring(i1 + 1);
		return s1 + s.charAt(i1) + s2 + s.charAt(i0) + s3;
	}

	public static boolean checkInclusionV1(String s1, String s2) {

		if (s2.length() < s1.length())
			return false;

		if (s2.contains(s1))
			return true;

		Map<Character, Integer> map = new HashMap<>();
		for (int i = 0; i < s1.length(); i++) {
			if (map.containsKey(s1.charAt(i))) {
				int n = map.get(s1.charAt(i));
				n = n + 1;
				map.put(s1.charAt(i), n);
			} // if
			else {
				map.put(s1.charAt(i), 1);
			}
		} // for

		int len = 0;
		Map<Character, Integer> tempMap = map;
		for (int i = 0; i < s2.length(); i++) {
			if (tempMap.containsKey(s2.charAt(i))) {
//    			int num = tempMap.get(s2.charAt(i));
//    			if (num < 1) return false;
				System.out.println(s2.charAt(i));
				int n = tempMap.get(s2.charAt(i));
				n = n - 1;
				tempMap.put(s2.charAt(i), n);
				len++;
				if (len == s1.length()) {
					for (Map.Entry<Character, Integer> entry : tempMap.entrySet()) {
						if (entry.getValue() > 0)
							return false;
					}
					return true;
				} // if
			} // if
			else {
				len = 0;
				tempMap = map;
			}
		} // for

		return false;
	}// checkInclusion

	public static void main(String[] args) {
//		System.out.println(checkInclusion("adc", "dcda"));
//		System.out.println(checkInclusion("ab", "eidbaooo"));
		System.out.println(checkInclusion("ab", "eidbaooo"));
	}// main

}// Permutation in string
