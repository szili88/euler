package problem10;

import util.PrimeUtil;

import java.util.stream.LongStream;

public class Problem10 {
    public static void main(String[] args) {
        System.out.println(LongStream.range(2, 2_000_000).parallel().filter(PrimeUtil::isPrime).sum());
    }
}
