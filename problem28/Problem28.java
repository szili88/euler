package problem28;

public class Problem28 {
    public static void main(String[] args) {
        long sum = 1;
        long current = 1;
        for (int i = 2; i <= 1001; i += 2) {
            for (int j = 0; j < 4; j++) {
                current += i;
                sum += current;
            }
        }

        System.out.println(sum);
    }
}
