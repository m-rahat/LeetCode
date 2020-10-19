import java.util.*;

public class Best_Time_To_Buy_and_Sell_Stock_II {

	public static void main(String [] args) {
		
		int[] prices = new int[] {7,1,5,3,6,4};
		System.out.println(maxProfit(prices));
		
	}//main
	
	/*
	 * i'm only thinking of the largest differences between the indexes
	 * how am i comparing whether one difference is greater than the other?
	 * 
	 * i'm looking at the diff between 7 and 1. it is -6 
	 * then i'm looking at the diff between 1 and 5. it is 4
	 * so i will execute the transaction, because it is big. 
	 * 
	 * but if it were 1 5 8 
	 * i would look at difference between 1, 5 and 1, 8
	 * but if it iwere 1 5 8 20
	 * i would look at diff between 1 5   1 8   1 20 and then i would pick
	 * the 1 20 transaction as it gives me the max profit
	 * 
	 * but if it is 1 5 8 20 3
	 * i will still pick the highest difference that is, 1 and 20
	 * 
	 * since i can have as many transactions as i would like
	 * 
	 * math.max (1-5, and 1-6)
	 * 
	 * 
	 * 7 1 5 3 6 4
	 * 
	 * i = 4
	 * buy = 3
	 * sell = 6
	 * profit = 4 + 3 = 7
	 * 
	 * 
	 * 1 2 3 4 5	
	 * 
	 * 
	 */
	
    public static int maxProfit(int[] prices) {
        
    	int buy = 0;
    	int sell = 0;
    	int profit = 0;
    	int index = 0;
    	
    	for (int i = 0; i < prices.length; i++) {
    		//if todays price is less than tomorrow's price, buy
			if (prices[i] < prices[i+1]) {
				buy = prices[i];
				index = i;
				break;
			}//if
    	}//for i
    	
    	for (int i = index; i < prices.length - 1; i++) {
    		//if todays price is less than tomorrow's price, buy
			if (prices[i] < prices[i+1]) {
				buy = prices[i];
				continue;
			}//if
			//if todays price is more than tomorrow's price, then check until the end of time
			//to find the maximum difference you can find then sell
			if (prices[i] > prices[i+1]) {
				sell = prices[i];
				profit += sell - buy;
			}//if

    	}//for i
    	
    	return profit;
    }//maxProfit
	
}//className
