import java.util.*;
public class Last_Stone_Weight {

    public static int lastStoneWeight(int[] stones) {
     
    	if (stones.length == 1) {
    		return stones[0];
    	}
    	
    	List<Integer> list = new ArrayList<>();
    	for (int i = 0; i < stones.length; i++) {
    		list.add(stones[i]);
    	}//for
    	
    	do {
    		Collections.sort(list);
    		int n1 = list.get(list.size() - 1);
    		int n2 = list.get(list.size() - 2);
    		if (n1 == n2) {
    			list.remove(list.size()-1);
    			list.remove(list.size()-1);
    		}
    		else {
    			int n = Math.abs(n1 - n2);
    			list.remove(list.size()-1);
    			list.remove(list.size()-1);
    			list.add(n);
    		}
    	}
    	while(list.size() > 1);
    	
    	if (list.size() == 0) return 0;
    	
    	System.out.println(list + " result");
    	
    	return list.get(0);
    }//lastStoneWeight
	
	public static void main(String[] args) {
		
		int[] stones = {3, 7, 8};
		
		System.out.println(lastStoneWeight(stones));
		
	}//main
}//Class
