import java.util.*;

/*
 * Given a valid (IPv4) IP address, return a defanged version of that IP address.

A defanged IP address replaces every period "." with "[.]".

 

Example 1:

Input: address = "1.1.1.1"
Output: "1[.]1[.]1[.]1"
Example 2:

Input: address = "255.100.50.0"
Output: "255[.]100[.]50[.]0"
 */
public class Defanging_IP_Address {

	public static void main(String [] args) {
		
		String input = "255.100.50.0";
		
		System.out.println(defangIPaddr(input));
		
	}//main
	
    public static String defangIPaddr(String address) {
        
    	/*
    	 * if i see a ., replace that with a [.]
    	 */
    	
    	return address.replace(".", "[.]");
    	
//    	String output = "";
//    	for (int i = 0; i < address.length(); i++) {
//    		if (address.charAt(i) == '.') {
//    			output += "[.]";
//    		}//if
//    		else {
//    			output += address.charAt(i);
//    		}//else
//    	}//for
//    	
//    	return output;
    }//defangIPaddr
	
}//Defanging IP Address

