package problem48;

import java.math.BigDecimal;

public class Problem48 {
    public static void main(String[] args) {
        BigDecimal result = BigDecimal.ZERO;
        for (int i = 1; i <= 1000; i++) {
            result = result.add(new BigDecimal(i).pow(i));
        }

        System.out.println(result.toString().substring(result.toString().length() - 10));
    }
}
