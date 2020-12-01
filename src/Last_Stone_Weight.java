import java.util.*;
public class Last_Stone_Weight {

    public static int lastStoneWeight(int[] stones) {
     
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
    			list.remove(list.size()-2);
    		}
    		else {
    			int n = Math.abs(n1 - n2);
    			list.remove(list.size()-1);
    			list.remove(list.size()-1);
    			list.add(n);
    		}
    	}
    	while(list.size() > 2);
    	
    	System.out.println(list + " result");
    	
    	return 0;
    }//lastStoneWeight
	
	public static void main(String[] args) {
		
		int[] stones = {2, 7, 4, 1, 8, 1};
		
		System.out.println(lastStoneWeight(stones));
		
	}//main
}//Class
