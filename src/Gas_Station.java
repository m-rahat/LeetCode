import java.util.*;

public class Gas_Station {

	public static void main(String[] args) {

		int[] gas = new int[] { 1, 2, 3, 4, 5 };
		int[] cost = new int[]{ 3, 4, 5, 1, 2 };
		//gas					-2 -2 -2 3  3
		//sum 					
		
		
		
		System.out.println(canCompleteCircuit(gas, cost));

	}// main

	//brute force solution
	public static int canCompleteCircuit(int[] gas, int[] cost) {

		int totalGas = 0;
		int totalCost = 0;

		for (int i = 0; i < gas.length; i++) {
			totalGas += gas[i];
			totalCost += cost[i];
		} // for

		if (totalCost > totalGas)
			return -1;

		for (int i = 0; i < gas.length; i++) {

			int tank = 0;
			boolean possible = true;

			for (int j = 0; j < gas.length; j++) {
				int station = (j + i + gas.length) % gas.length;
				tank = tank + gas[station] - cost[station];
				if (tank < 0) {
					possible = false;
					break;
				} // if
			} // for j
			if (possible)
				return i;

		} // for i

		return -1;
	}// canCompleteCircuirt
	
	//Leetcode solution
    public int canCompleteCircuitV2(int[] gas, int[] cost) {
        int sum = 0;
        for(int i=0; i<gas.length; i++) {
            gas[i] -= cost[i];
            sum += gas[i];
        }
        if(sum < 0)
            return -1;
        sum = 0;
        int index = 0;
        for(int i=0; i<gas.length; i++) {
            sum += gas[i];
            if(sum < 0) {
                sum = 0;
                index = i+1;
            }
        }
        
        return index;
    }

}// Gas_Station
