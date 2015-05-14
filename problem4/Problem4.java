package problem4;

public class Problem4 {
    public static void main(String[] args) {
        long result = 0;
        for (int i = 100; i < 1000; i++) {
            for (int j = i; j < 1000; j++) {
                int number = i * j;
                String numberStringValue = String.valueOf(number);
                if (number > result && numberStringValue.equals(new StringBuilder(numberStringValue).reverse().toString())) {
                    result = number;
                }
            }
        }
        System.out.println(result);
    }
}
