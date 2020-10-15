import java.util.*;

public class ParkingSystem {

	int Big = 0;
	int Medium = 0;
	int Small = 0;
	
	
	public static void main(String [] args) {
		
		ParkingSystem obj = new ParkingSystem(1, 1, 0);
		System.out.println(obj.addCar(1));
		System.out.println(obj.addCar(2));
		System.out.println(obj.addCar(3));
		System.out.println(obj.addCar(1));
		
	}//main
	
	/**
	 * Your ParkingSystem object will be instantiated and called as such:
	 * ParkingSystem obj = new ParkingSystem(big, medium, small);
	 * boolean param_1 = obj.addCar(carType);
	 */
	
    public ParkingSystem(int big, int medium, int small) {
        
    	Big = big;
    	Medium = medium;
    	Small = small;
    	
    }//ParkingSystem
    
    public boolean addCar(int carType) {
        
    	if (carType == 1) {
    		
    		if (Big > 0) {
    			Big--;
    			return true;
    		}//if
    		else {
    			return false;
    		}//else
    		
    	}//if Big
    	
    	if (carType == 2) {
    		
       		if (Medium > 0) {
    			Medium--;
    			return true;
    		}//if
    		else {
    			return false;
    		}//else
    		
    	}//if
    	
    	if (carType == 3) {
    		
       		if (Small > 0) {
    			Small--;
    			return true;
    		}//if
    		else {
    			return false;
    		}//else
    	}//if
    	
    	return true;
    }//addCar
	
}//Parking_System
