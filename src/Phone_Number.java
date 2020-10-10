import java.util.*;
import java.util.regex.Pattern;

public class Phone_Number {

	public static void main(String [] args) {
		
		String input = "(929)-398-4910";
		
		System.out.println(validNumber(input));
		
	}//main
	
	public static boolean validNumber(String s) {
		
		boolean result = Pattern.matches("[(][1-9]{3}[)][-][0-9]{3}[-][0-9]{4}", s);
		
		return result;
	}//boolean
	
}//Phone_Number
