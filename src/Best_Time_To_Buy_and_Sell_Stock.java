import java.util.*;

public class Best_Time_To_Buy_and_Sell_Stock {

	public static void main(String [] args) {
		
		int[] prices = new int[]{7, 6, 4, 3, 1};
		
		System.out.println(maxProfit(prices));
	}//main
	
    public static int maxProfit(int[] prices) {
        
    	/*
    	 * Must buy before selling, so iteration can only move forward
    	 * for each day, note down the buying price and keep record of that
    	 * then compare that buying price and selling price of each date to find max
    	 * 
    	 * buying and selling on the same day makes no sense
    	 * 
    	 * 
    	 */
    	
    	int maxProfit = 0;
    	
    	for (int i = 0; i < prices.length - 1; i++) {
    		
    		for (int j = i + 1; j < prices.length; j++) {
    			
    			int diff = prices[j] - prices[i];
    			if (diff > maxProfit) {
    				maxProfit = diff;
    			}//if
    			
    		}//for
    		
    	}//for
    	
    	
    	return maxProfit;
    }//maxProfit
	
}//bttbass
