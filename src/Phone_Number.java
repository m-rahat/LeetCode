import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Stream;
import java.util.*;

public class Phone_Number {

	public static void main(String [] args) {
		
		String input = "3472389619";

		//the grouping was done using () in the regex
		//so, ([0-9]{3}) is $1 aka group 1 and vice versa. this took me too long to figure out
		String output = input.replaceFirst("([0-9]{3})([0-9]{3})([0-9]{4})", "($1)-$2-$3");
		

		System.out.println(output);
		System.out.println(validNumber(output));
		
		
	}//main
	
	public static boolean validNumber(String s) {
		
//		boolean result = Pattern.matches("[(][1-9]{3}[)][-][0-9]{3}[-][0-9]{4}", s);
//		boolean result = s.matches("\\(\\d{3}\\)-\\d{3}-\\d{4}");
		
		Pattern pattern = Pattern.compile("[(][1-9]{3}[)][-][0-9]{3}[-][0-9]{4}");
		Matcher matcher = pattern.matcher(s);
		
		boolean result = matcher.matches();
		
		return result;
	}//boolean
	
}//Phone_Number
