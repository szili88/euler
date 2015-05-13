package problem12;

public class Problem12 {
    public static void main(String[] args) {
        long triangleNumber;
        long number = 0;
        int divisorCount;
        do {
            divisorCount = 0;
            triangleNumber = number * (number + 1) / 2;

            for (int i = 1; i <= Math.sqrt(triangleNumber); i++) {
                if (triangleNumber % i == 0) {
                    divisorCount += 2;
                }
            }

            number++;
        } while (divisorCount <= 500);
        System.out.println(triangleNumber);
    }
}
