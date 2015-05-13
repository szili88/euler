package problem16;

import java.math.BigDecimal;

public class Problem16 {
    public static void main(String[] args) {
        BigDecimal bigDecimal = new BigDecimal(2).pow(1000);
        long sum = 0;
        while (!bigDecimal.equals(BigDecimal.ZERO)) {
            sum += bigDecimal.remainder(BigDecimal.TEN).intValue();
            bigDecimal = bigDecimal.divideToIntegralValue(BigDecimal.TEN);
        }

        System.out.println(sum);
    }
}
