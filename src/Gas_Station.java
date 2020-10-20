import java.util.*;

public class Gas_Station {

	public static void main(String[] args) {

		int[]  gas = new int[] { 1, 2, 3, 4, 5 };
		int[] cost = new int[] { 3, 4, 5, 1, 2 };

//		int start = 2;
//		for(int i = 0; i <= gas.length; i++) {
//			System.out.println(gas[(start + i + gas.length) % gas.length]);
//		}
		
		System.out.println(canCompleteCircuit(gas, cost));

	}// main


	public static int canCompleteCircuit(int[] gas, int[] cost) {

		int tank = 0;
		boolean madeIt = false;

		for (int i = 0; i < gas.length; i++) {
			
			int startStation = i;
			
			for (int j = 0; j <= gas.length; j++) {
				int startIndex = (startStation + j + gas.length) % gas.length;
				if (tank + gas[startIndex] >= cost[startIndex]) {
					tank = tank + gas[startIndex];
					System.out.println(tank);
				}
				else {
					break;
				}
			}//for
			
			if (madeIt) return startStation;
			
		} // for
		
		System.out.println(tank);

		return -1;
	}// canCompleteCircuirt

}// Gas_Station
