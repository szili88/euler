package problem6;

import java.util.stream.LongStream;

public class Problem6 {
    public static void main(String[] args) {
        long squareOfSums = LongStream.rangeClosed(1, 100).sum();
        squareOfSums *= squareOfSums;
        long sumOfSquares = LongStream.rangeClosed(1, 100).map(x -> x * x).sum();

        System.out.println(squareOfSums - sumOfSquares);
    }
}
