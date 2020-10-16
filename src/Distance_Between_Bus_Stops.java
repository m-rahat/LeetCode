import java.util.*;

public class Distance_Between_Bus_Stops {

	public static void main(String [] args) {
		
		int[] distance = new int[] {7, 10, 1, 12, 11, 14, 5, 0};
		
		System.out.println(distanceBetweenBusStops(distance, 7, 2));
		
	}//main
	
	
    public static int distanceBetweenBusStops(int[] distance, int start, int destination) {
        
    	int dist1 = 0;
    	int dist2 = 0;
    	
    	if (start > destination) return distanceBetweenBusStops(distance, destination, start);
    	
    	for (int i = start; i < destination; i++) {
    		dist1 += distance[i];
    	}//for
    	
    	for (int i = destination; i < distance.length; i++) {
    		dist2 += distance[i];
    	}//for
    	
    	for (int i = 0; i < start; i++) {
    		dist2 += distance[i];
    	}//for
    	
    	System.out.println(dist1);
    	System.out.println(dist2);
    	
    	return Math.min(dist1, dist2);
    }//distanceBetweenBusStops
	
}//distance between bus stops
