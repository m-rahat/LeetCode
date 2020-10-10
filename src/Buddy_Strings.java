import java.util.*;

public class Buddy_Strings {

	public static void main(String[] args) {

		System.out.println(buddyStrings("aa", "aa"));

	}// main

	public static boolean buddyStrings(String A, String B) {
		if (A.length() != B.length())
			return false;

		if (A.equals(B)) {
			Set set = new HashSet();
			for (int i = 0; i < A.length(); i++) {
				if (set.contains(A.charAt(i)))
					return true;
				else
					set.add(A.charAt(i));
			}
			return false;
		}

		int counter = 0;
		int aChars = 0;
		int bChars = 0;
		for (int i = 0; i < A.length(); i++) {
			aChars += A.charAt(i);
			bChars += B.charAt(i);
			if (A.charAt(i) != B.charAt(i))
				counter++;
			if (counter > 2)
				return false;
		}
		return counter <= 2 && aChars == bChars;
	}// buddyStrings

	public static boolean buddyStringsV1(String A, String B) {

		if (A.length() == 0 || B.length() == 0)
			return false;
		if (A.length() != B.length())
			return false;

		for (int i = 0; i < A.length(); i++) {

			for (int j = i + 1; j < A.length(); j++) {

				String st = swap(A, i, j);
				if (st.equals(B)) {
					return true;
				} // if

			} // for

		} // for

		return false;
	}// buddyStrings

	public static String swap(String A, int i, int j) {

		char ci = A.charAt(i);
		char cj = A.charAt(j);

		char[] charArray = A.toCharArray();
		charArray[i] = cj;
		charArray[j] = ci;

		return new String(charArray);
	}// swap

}// Buddy_Strings
