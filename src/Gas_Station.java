import java.util.*;

public class Gas_Station {

	public static void main(String[] args) {

		int[] gas = new int[] { 1, 2, 3, 4, 5 };
		int[] cost = new int[] { 3, 4, 5, 1, 2 };

//		int start = 2;
//		for(int i = 0; i <= gas.length; i++) {
//			System.out.println(gas[(start + i + gas.length) % gas.length]);
//		}

		System.out.println(canCompleteCircuit(gas, cost));

	}// main

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

}// Gas_Station
