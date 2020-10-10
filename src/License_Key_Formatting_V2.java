import java.util.*;

public class License_Key_Formatting_V2 {

	public static void main(String[] args) {

		/*
		 * "2-4A0r7-4k" K = 3 "24-A0R-74K"
		 * 
		 * "5F3Z-2e-9-w" K = 4 "5F3Z-2E9W"
		 */

		String S = "2-4A0r7-4k";
		int K = 3;

		System.out.println(licenseKeyFormatting(S, K));

	}// main

	public static String licenseKeyFormatting(String S, int K) {

		int len = S.length();
		char[] charArray = new char[len];

		S = S.toUpperCase();

		S = S.replaceAll("-", "");

		if (S.length() == 0 || K == 0)
			return S;

		int count = 0;
		List<Character> list = new ArrayList<>();
		for (int i = S.length() - 1; i >= 0; i--) {
			if (count == K) {
				list.add('-');
				count = 0;
				list.add(S.charAt(i));
				count++;
			} // if
			else {
				charArray[i] = S.charAt(i);
				list.add(S.charAt(i));
				count++;
			} // else
		} // for

		System.out.println(list);
		
		String output = "";
		for (int i = list.size() - 1; i >= 0; i--) {
			output += list.get(i);
		}//for
		
		System.out.println(output);
		

		return output;

	}// licenseKeyFormatting

}// License Key Formatting
