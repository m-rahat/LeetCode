import java.util.*;

public class License_Key_Formatting {

	public static void main(String[] args) {

		/*
		 * "2-4A0r7-4k" K = 3
		 * "24-A0R-74K"
		 */
		String S = "2-5G-3J";
		int K = 2;
		
		System.out.println(licenseKeyFormatting(S, K));
		
	}// main

	public static String licenseKeyFormatting(String S, int K) {
		
		S = S.toUpperCase();
		int minGroup = 1;
		for (int i = 0; i < S.length(); i++) {
			if (S.charAt(i) == '-') {
				minGroup++;
			}
		}//for
		
		S = S.replaceAll("-", "");
		String replacement = "";
		
		System.out.println(minGroup);
	
		String regex = "([A-Z0-9]{1," + K + "})";
		for (int i = 1; i < minGroup; i++) {
			regex += "([A-Z0-9]{" + K + "})";
		}//for
		System.out.println(regex);
		
		for (int i = 1; i <= minGroup; i++) {
			replacement += "$"+i + "-";
		}//for
		
		replacement = replacement.substring(0, replacement.length() - 1);
		
		System.out.println(replacement);
		
		String output = S.replaceFirst(regex, replacement);
		return output;
		
		
	}//licenseKeyFormatting

}// License Key Formatting
