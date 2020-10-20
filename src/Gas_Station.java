import java.util.*;

public class Gas_Station {

	public static void main(String [] args) {
		
		int [] a = new int[] {1, 2, 3, 4, 5};
		
		int start = 2;
		for (int i = 0; i < a.length; i++) {
		    System.out.println(a[(start - i + a.length) % a.length]);
		}
		
	}//main

	/*
	 * tank = 0
	 * start at station  3: tank = 0 + 4, no cost?
	 * travel to station 4: tank = 4 + 5 - 1 = 8
	 * travel to station 0: tank = 8 + 1 - 2 = 7
	 * travel to station 1: tank = 7 + 2 - 3 = 6
	 * travel to station 2: tank = 6 + 3 - 4 = 5
	 * travel to station 3: tank = 5 + 0 - 5 =  0
	 * 
	 * tank = 0
	 * start at station  0: tank = 0 + 1 - 0 = 1
	 * travel to station 1: tank = 1 + 2 - 3 = 0
	 * travel to station 2: tank = 0 + 3 - 4 = -1
	 * travel to station 3: tank = -1 + 4 - 5 = -2
	 * 
	 * if leftover in tank is > 0, keep going. otherwise, halt and move to start from next
	 * 
	 * tank = 0
	 * start at station  1: tank = 0 + 2 - 0 = 2
	 * travel to station 2: tank = 2 + 3 - 4 = 1
	 * travel to station 3: tank = 1 + 4 - 5 = 0
	 * travel to station 4: tank = 0 + 5 - 1 = 4
	 * travel to station 0: tank = 4 + 1 - 2 = 3 why?
	 * travel to station 1: tank = 3 + 2 - 3 = 2. seems right to me
	 * 
	 * start with tank 0
	 * check how much gas i have in the current station i'm in
	 * check how much it would cost to go to the next station
	 * if i can  go to the next station with 0 or more gas in tank, go
	 * if not, check by starting from the next gas station
	 * 
	 * 
	 * 
	 */
	
    public int canCompleteCircuit(int[] gas, int[] cost) {
        
    	int tank = 0;
    	
    	for (int i = 0; i < gas.length; i++) {
    		
    		int startStation = i;
    		
    		for (int j = i; j < gas.length; j++) {
    			
    	   		int thisStation = gas[i];
        		int costToGo = cost[i];
        		
        		//if what's left in tank + gas from this station will allow us to go, then go
        		if (tank + thisStation >= costToGo) {
        			tank = tank + thisStation - costToGo;
        		}//if
        		else {
        			//start from some other station
        			break;
        		}// don't go
    			
    		}//for 
    		
    	}//for
    	
    	return -1;
    }//canCompleteCircuirt
	
}//Gas_Station


