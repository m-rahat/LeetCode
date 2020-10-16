import java.util.*;

public class String_With_Odd_Count {

	public static void main(String [] args) {
		
		System.out.println(generateTheString(4));
	}
	
    public static String generateTheString(int n) {
        
		StringBuilder st = new StringBuilder();
    	if (n % 2 == 0) {
    		for (int i = 0; i < n - 1; i++) {
    			st.append("a");
    		}
    		st.append("b");
    	} 
    	else {
    		for(int i = 0; i < n; i++) {
    			st.append("a");
    		}
    	}
    	
    	return st.toString();
    }
	
}//Class Name
