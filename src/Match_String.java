import java.util.*;

/*
 * Given an input string, make the computer match the string in the shortest possible time
 */
public class Match_String extends Thread {

	private static void permute(String str, int l, int r, Set<String> set, long factorial) {
		if (l == r) {
//            System.out.println(str); 
			set.add(str);
		} // if
		else {
			for (int i = l; i <= r; i++) {
				str = swap(str, l, i);
				permute(str, l + 1, r, set, factorial);
				str = swap(str, l, i);
			} // for
		} // else
	} // permute

	public static String swap(String a, int i, int j) {
		char temp;
		char[] charArray = a.toCharArray();
		temp = charArray[i];
		charArray[i] = charArray[j];
		charArray[j] = temp;
		return String.valueOf(charArray);
	}// swap

	public static long factorial(int n) {
		long ans = 1;
		for (int i = 0; i < n; i++) {
			ans *= i;
		}
		return ans;
	}// factorial

	public void run() {
		//generate thread
	}// run

	public static void main(String[] args) {

		long start = System.currentTimeMillis();

		String input = "thequickbro";
		System.out.println("Input length : " + input.length());
		Set<String> set = new HashSet<>();
		long fact = factorial(input.length());
		permute(input, 0, input.length() - 1, set, fact);
		System.out.println("Set size : " + set.size());
		long end = System.currentTimeMillis();
		System.out.println("Runtime : " + (end - start) / 1000);

	}// main

}// class
