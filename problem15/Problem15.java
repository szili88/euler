package problem15;

import java.math.BigDecimal;

public class Problem15 {
    public static void main(String[] args) {
        BigDecimal result = BigDecimal.ONE;
        for (int i = 1; i <= 40; i++) {
            result = result.multiply(new BigDecimal(i));
        }

        for (int i = 1; i <= 20; i++) {
            result = result.divide(new BigDecimal(i * i));
        }

        System.out.println(result);
    }
}
