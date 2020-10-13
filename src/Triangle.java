import java.util.*;
import java.util.stream.Collectors;

public class Triangle {

	public static void main(String [] args) {
		
	}//main
	
    public int minimumTotal(List<List<Integer>> triangle) {
        
    	/*
    	 * i'm given a list of lists.
    	 * one first list.get(0), i'm assuming that the size would be 1. 
    	 * then the list.size = 2, al the way upto the end of the list
    	 * where list.get(n) = the end of the list.
    	 * 
    	 * first list size will always be zero, so total = first list item
    	 * return the minimum possible value, from adding total to each number
    	 * but with limited range of index - 1, index, and index + 1 range
    	 * 
    	 * [[-1],[2,3],[1,-1,-3]]
    	 * out : -2
    	 * expected: -1
    	 */
    	
    	int index = 0;
    	int total = triangle.get(0).get(0);
    	
    	for (int i = 1; i < triangle.size(); i++) {
    		
    		List<Integer> list = triangle.get(i);
    		
    		int result = total + list.get(index - 1);
    		
    		int range = index + 1;
    		
    		for (int j = index - 1; j < range; j++) {
    			if (result + list.get(i) < result) {
    				result = result + list.get(i);
    				index = j;
    			}//if
    		}//for
    		
    		total += result;
    		
    	}//for
    	
    	return total;
    }//minimumTotal
	
	
}//Triangle
