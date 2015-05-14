package problem20;

import java.math.BigInteger;

public class Problem20 {
    public static void main(String[] args) {
        long result = 0;
        BigInteger factorial = BigInteger.ONE;
        for (int i = 1; i <= 100; i++) {
            factorial = factorial.multiply(new BigInteger(String.valueOf(i)));
        }
        String factorialString = factorial.toString();
        for (int i = 0; i < factorialString.length(); i++) {
            result += Long.parseLong(factorialString.substring(i, i + 1));
        }
        System.out.println(result);
    }
}
