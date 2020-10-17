import java.util.*;

public class Prime_Of_Set_Bits_Binary {

	public static void main(String[] args) {

		System.out.println(countPrimeSetBits(244, 269));

	}// main

    public static int countPrimeSetBits(int L, int R) {
        int ans = 0;
        for (int x = L; x <= R; ++x)
            if (isSmallPrime(Integer.bitCount(x)))
                ans++;
        return ans;
    }
    public static boolean isSmallPrime(int x) {
        return (x == 2 || x == 3 || x == 5 || x == 7 ||
                x == 11 || x == 13 || x == 17 || x == 19);
    }

}// class name
