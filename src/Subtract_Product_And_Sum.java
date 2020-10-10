import java.util.*;

public class Subtract_Product_And_Sum {

	public static void main(String[] args) {

		System.out.println(subtractProductAndSum(4421));

	}// main

	public static int subtractProductAndSum(int n) {

		List<Integer> list = new ArrayList<>();
		
		while (n > 0) {
			int temp = n % 10;
			n = n / 10;
			list.add(temp);
		} // while

		int product = 1;
		int sum = 0;

		Iterator<Integer> it = list.iterator();

		while (it.hasNext()) {
			int number = it.next();
			sum += number;
			product *= number;
		} // while

		System.out.println(sum);
		System.out.println(product);

		return product - sum;

	}// SubtractProductandsum

}// Subtract prodcut and sum
