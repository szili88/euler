package problem7;

import util.PrimeUtil;

public class Problem7 {
    public static void main(String[] args) {
        long primeInput = 2;
        for (int i = 1; i < 10_001; i++) {
            primeInput++;
            while (!PrimeUtil.isPrime(primeInput)) {
                primeInput++;
            }
        }
        System.out.println(primeInput);
    }
}
