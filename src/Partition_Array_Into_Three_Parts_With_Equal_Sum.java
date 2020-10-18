import java.util.*;

public class Partition_Array_Into_Three_Parts_With_Equal_Sum {

	public static void main(String [] args) {
		
//		int[] A = new int[] {18,12,-18,18,-19,-1,10,10};

		int[] A = new int[] {3,3,6,5,-2,2,5,1,-9,4};
		System.out.println(canThreePartsEqualSum(A));
		
	}//main
	
	
    public static boolean canThreePartsEqualSum(int[] A) {
        
    	if (A.length < 3) return false;
    	
    	int[] sums = new int[3];
    	int total = 0;
    	
    	for (int i = 0; i < A.length; i++) {
    		total += A[i];
    	}//for
    	
    	int index = 0;
    	int k = 0;
    	for (int i = 0; i < A.length - 2; i++) {
    		sums[0] += A[i];
    		if (sums[0] == total/3) {
    			index = i + 1;
    			break;
    		}//if
    	}//for
    	
    	for (int i = index; i < A.length - 1; i++) {
    		sums[1] += A[i];
    		if (sums[1] == total/3) {
    			index = i + 1;
    			break;
    		}//if
    	}//for
    	
    	for (int i = index; i < A.length; i++) {
    		sums[2] += A[i];
    		
    	}//for
    		
    	System.out.println(Arrays.toString(sums));
    	if (sums[0] == sums[1] && sums[0] == sums[2]) {
    		return true;
    	}//if
    	
    	return false;
    }//canThreePartsEqualSum
	
}//class name

