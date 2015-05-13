package util;

public class PrimeUtil {
    public static boolean isPrime(long number) {
        if (number < 2) {
            return false;
        }

        if (number > 2 && number % 2 == 0) {
            return false;
        }

        for (int i = 3; i <= Math.sqrt(number); i = i + 2) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }
}
