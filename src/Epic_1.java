import java.util.regex.Pattern;

/*
 * Alarm Keypad
 * -- Your security alarm keypad has 9 number buttons (1-9),
 * but one of the buttons may be intermittently faulty. To 
 * accommodate this, your alarm will accept an incorrectly 
 * entered code that is missing one or more occurrences of the
 * same number as long as all other numbers are correct and in 
 * sequence. For example, if the expected code is 18684, the
 * entered codes 164, 1864, 8684, and 18684 are among those that
 * should be accepted. Write a function that will take as parameters
 * the expected security code and the security code that was actually
 * entered. Your function will report whether the user-entered security
 * code should be accepted.
 * 
 * public static boolean validate(int input, int password){
 * 	
 * 		if (input == pasword) return true;
 * 	
 * }
 * 
 */

public class Epic_1 {

	/*
	 * public static boolean validate(int input, int password) {
	 * 
	 * if(input == password) return true;
	 * 
	 * String inputString = Integer.toString(input); String passwordString =
	 * Integer.toString(password);
	 * 
	 * for (int i = 0; i < passwordString.length(); i++) { char c =
	 * passwordString.charAt(i); String matchingString =
	 * passwordString.replaceAll(Character.toString(c), "");
	 * System.out.println(inputString); System.out.println(matchingString);
	 * System.out.println("------"); if (inputString.equals(matchingString)) {
	 * return true; } }
	 * 
	 * return false;
	 * 
	 * }
	 */

	public static boolean validate(int input, int password) {

		if (input == password)
			return true;

		String inputString = Integer.toString(input);
		char[] inputCharArray = inputString.toCharArray();
		String passwordString = Integer.toString(password);

		String regex = "";
		for (int i = 0; i < passwordString.length(); i++) {
			char c = passwordString.charAt(i);
			for (int j = 0; j < passwordString.length(); j++) {
				if (passwordString.charAt(j) == c) {
				regex += "[a-zA-Z0-9-_]*";
				}
				else {
					regex += "[" + Character.toString(passwordString.charAt(j)) + "]";
				}
			}
//			System.out.println(regex);
			if (Pattern.matches(regex, inputString)) {
				return true;
			}
			else {
				regex = "";
			}
			
		}

		return false;

	}

	public static void main(String[] args) {
		System.out.println(validate(1455678, 155651));
	}

}
