import java.util.*;

public class Container_With_Most_Water {

	public static void main(String [] args) {
		
//		int[] height = new int[] {1, 8, 6, 2, 5, 4, 8, 3, 7};
		int[] height = new int[] {4, 3, 2, 1, 4};
		System.out.println(maxArea(height));
		
	}//main
	
    public static int maxArea(int[] height) {
        
    	/*
    	 * i = 1, h = 8 with i = 6, h = 8
    	 * l = 5, w = 8
    	 * a = 40
    	 * 
    	 * i = 1, h = 8 with i = 8, h = 7
    	 * l = 7, w = 7
    	 * a = 49
    	 * 
    	 * 
    	 */
    	int w = 0;
    	int w1 = 0;
    	int w2 = 0;
    	int h = 0;
    	int h1 = 0; 
    	int h2 = 0;
    	int area = 0;
    	
    	for (int i = 0; i < height.length; i++) {
    		
    		w1 = i;
    		h1 = height[i];
    		
    		for (int j = i+1; j < height.length; j++) {
    			
    			w2 = j;
    			h2 = height[j];
    			
    			//finding the width
    			w = w2 - w1;
    			//if height 1 greater than h2
    			h = Math.min(h1, h2);
    			
    			int tempArea = h * w;
    			
    			if (tempArea > area) {
    				area = tempArea;
    			}//if
    			
    		}//for j
    		
    	}//for i
    	
    	return area;
    }//maxArea
	
}//Container with most water
