package problem3;

public class Problem3 {
    public static void main(String[] args) {
        long dividend = 600851475143L;
        long divisor = 1;
        while (dividend != 1) {
            divisor++;
            while (dividend != 1 && dividend % divisor == 0) {
                dividend /= divisor;
            }
        }
        System.out.println(divisor);
    }
}
