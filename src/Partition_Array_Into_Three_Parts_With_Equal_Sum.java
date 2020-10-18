import java.util.*;

public class Partition_Array_Into_Three_Parts_With_Equal_Sum {

	public static void main(String [] args) {
		
		int[] A = new int[] {0,2,1,-6,6,-7,9,1,2,0,1};
		
		System.out.println(canThreePartsEqualSum(A));
		
	}//main
	
	
    public static boolean canThreePartsEqualSum(int[] A) {
        
    	if (A.length < 3) return false;
    	
    	int[] sums = new int[3];
    	boolean[] array = new boolean[] {false, false, false};
    	int total = 0;
    	
    	for (int i = 0; i < A.length; i++) {
    		total += A[i];
    	}//for
    	
    	int k = 0;
    	for (int i = 0; i < A.length; i++) {
    		
    		if (sums[k] == total/3) k++;
    		
    		if (sums[k] + A[i] > total/3) {
    			System.out.println(sums[k] + " here");
    			k++;
    		}//if
    		else {
    			sums[k] += A[i];
    			System.out.println(sums[k] + " there");
    		}//else
    		
    	}//for
    	
    	System.out.println(Arrays.toString(sums));
    
    	if (sums[0] == sums[1] && sums[0] == sums[2]) {
    		return true;
    	}//if
    	
    	return false;
    }//canThreePartsEqualSum
	
}//class name

//add up to see what the max number could be
//tthen on each iteration, find out how many
//iterations it takes to get upto that max number / 3
//
//if max/3 found, start adding upto another number. if num >/ max/3, then return false
//
//if second num found, start adding 3rd number
//
//if num1 == num2 == num3 false,
//
//what do we do?
//		
		