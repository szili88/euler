package problem2;

import java.util.PrimitiveIterator;
import java.util.stream.IntStream;

public class Problem2 {
    public static void main(String[] args) {
        int[] seed = new int[] {0, 1};

        PrimitiveIterator.OfInt iterator = IntStream.generate(() -> {
            int t = seed[0];
            seed[0] = seed[1];
            seed[1] = t + seed[0];
            return seed[1];
        }).filter(x -> x % 2 == 0).iterator();

        long sum = 0;
        int nextFibonacci = 0;
        while ((nextFibonacci = iterator.next()) < 4_000_000) {
            sum += nextFibonacci;
        }
        System.out.println(sum);
    }
}
