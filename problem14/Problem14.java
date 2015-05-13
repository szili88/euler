package problem14;

public class Problem14 {
    public static void main(String[] args) {
        long maxNumber = 0;
        int maxCount = 0;
        for (long i = 1; i < 1000000; i++) {
            long number = i;
            int count = 0;
            while (number != 1) {
                if (number % 2 == 0) {
                    number /= 2;
                } else {
                    number *= 3;
                    number++;
                }
                count++;
            }
            if (maxNumber == 0 || count > maxCount) {
                maxNumber = i;
                maxCount = count;
            }
        }

        System.out.println(maxNumber);
    }
}
