package problem21;

public class Problem21 {
    public static void main(String[] args) {
        long sum = 0;
        for (int a = 0; a < 10000; a++) {
            int b = sumOfProperDivisors(a);
            if (a != b && sumOfProperDivisors(b) == a) {
                sum += a;
            }
        }
        System.out.println(sum);
    }

    private static int sumOfProperDivisors(int a) {
        int sum = 0;
        for (int i = 1; i <= a / 2; i++) {
            if (a % i == 0) {
                sum += i;
            }
        }
        return sum;
    }
}
