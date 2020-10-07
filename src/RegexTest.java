// package whatever; // don't place package name!

/*
function isMember()
function setup(ls)

Given a list of strings, find whether a word exists in the list.

For example, ["foo", "bar", "baz"] -> isMember("foo", ls)

isMember("f*o", ls) -> True

isMember("fi*", ls) -> False

isMember("*ar", ls) -> True

isMember("**z", ls) -> ?

https://docs.google.com/document/u/4/d/1HOOPehV4kwpYH7fBjuRJ7L51Evxupa4aJrLwnUteXq4/edit
*/

import java.util.*;
import java.util.regex.Pattern;

public class RegexTest {

	public static void main(String[] args) {

		String[] array = { "foo", "bar", "baz" };
		List<String> list = Arrays.asList(array);
		System.out.println(isMember(list, "**z"));

	}// main

	public static Boolean isMember(List<String> list, String input) {

		char[] charArray = input.toCharArray();
		String regex = "";
		for (int i = 0; i < charArray.length; i++) {
			if (charArray[i] == '*') {
				regex += "[a-zA-Z0-9-_]";
			} // if
			else {
				regex += "[" + charArray[i] + "]";
			} // else
		} // for

		for (int i = 0; i < list.size(); i++) {
			if (Pattern.matches(regex, list.get(i))) {
				return true;
			}
		} // for

		return false;
	}// isMember

}// RegexTest
