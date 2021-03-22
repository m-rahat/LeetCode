import java.util.regex.Pattern;

/*
 * 	Suppose you need to validate a serial number for a product that
 *  meets the following criteria: 1) The serial number starts with 
 *  a string of three numbers, followed by a '-', three 
 *  capital vowels [A,E,I,O,U,Y], followed again by a '-', then 
 *  another string of three numbers, followed by a final '-' and 
 *  three more vowels [A,E,I,O,U,Y]. 2. 2) The second group of numbers
 *  must not be the same as the first group. 3) The second group of 
 *  letters must not be the same as the first group. 4) The groups 
 *  of numbers may not contain zero. Valid Examples: '123-AEI-456-AEO'. 
 *  Invalid Examples: '123-AEI-123-AEO', '123-AEI-456-AEI', '123-AEI-45E-AEI 
 */
public class Shaon_Regex {

	public static boolean validate(String input) {

		if (input.length() < 15)
			return false;
		String group1 = input.substring(0, 3);

		if (!Pattern.matches("[1-9]{3}", group1))
			return false;
		String group2 = input.substring(3, 4);
		if (!group2.equals("-"))
			return false;
		String group3 = input.substring(4, 7);
		if (!Pattern.matches("[AEIOU]{3}", group3))
			return false;
		String group4 = input.substring(7, 8);
		if (!group4.equals("-"))
			return false;
		String group5 = input.substring(8, 11);
		if (!Pattern.matches("[1-9]{3}", group5) || group1.equals(group5))
			return false;
		String group6 = input.substring(11, 12);
		if (!group6.equals("-"))
			return false;
		String group7 = input.substring(12, 15);
		if (!Pattern.matches("[AEIOU]{3}", group7) || group7.equals(group3))
			return false;
		return true;
	}

	public static void main(String[] args) {

		String input = "123-AEI-456-AEO";

		System.out.println(validate(input));

	}

}
