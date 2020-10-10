import java.util.*;

public class License_Key_Formatting {

	public static void main(String[] args) {

		/*
		 * "2-4A0r7-4k" K = 3
		 * "24-A0R-74K"
		 * 
		 * "5F3Z-2e-9-w" K = 4
		 * "5F3Z-2E9W"
		 */
		
		
		String S = "---";
		int K = 3;
		
		System.out.println(licenseKeyFormatting(S, K));
		
	}// main

	public static String licenseKeyFormatting(String S, int K) {
		
		S = S.toUpperCase();
		
		S = S.replaceAll("-", "");
		String replacement = "";
		
		if (S.length() == 0) return "";
		
		int minGroup = (int) Math.ceil(S.length()/(double)K);
		System.out.println(minGroup);
	
		String regex = "([A-Z0-9]{1," + K + "})";
		for (int i = 1; i < minGroup; i++) {
			regex += "([A-Z0-9]{" + K + "})";
		}//for
		System.out.println(regex);
		
		for (int i = 1; i < minGroup + 1; i++) {
			replacement += "$"+i + "-";
		}//for
		
		replacement = replacement.substring(0, replacement.length() - 1);
		
		System.out.println(replacement);
		
		String output = S.replaceFirst(regex, replacement);
		return output;
		
		
	}//licenseKeyFormatting

}// License Key Formatting
