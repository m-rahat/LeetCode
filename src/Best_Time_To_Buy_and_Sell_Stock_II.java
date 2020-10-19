import java.util.*;

public class Best_Time_To_Buy_and_Sell_Stock_II {

	public static void main(String [] args) {
		
		int[] prices = new int[] {7,1,5,3,6,4};
		System.out.println(maxProfit(prices));
		
	}//main
	
	/*
	 *if 
	 * 
	 */
	
    public static int maxProfit(int[] prices) {
    	int profit = 0;
    	
    	for(int i = 1; i < prices.length; i++) {
    	
    		if (prices[i] > prices[i-1]) {
    			profit += prices[i] - prices[i-1];
    		}
    		
    	}//for
    	
    	return profit;
    }//maxProfit
	
}//className
