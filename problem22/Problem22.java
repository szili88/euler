package problem22;

import java.io.IOException;
import java.math.BigInteger;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;

public class Problem22 {
    public static void main(String[] args) throws IOException {
        String fileContent = Files.readAllLines(Paths.get(args[0])).get(0);
        String[] words = fileContent.substring(1, fileContent.length() - 1).split("\",\"");
        Arrays.sort(words);
        BigInteger sum = BigInteger.ZERO;
        System.out.println(words[937]);
        for (int i = 0; i < words.length; i++) {
            int nameValue = words[i].chars().map(x -> x - 'A' + 1).sum();
            sum = sum.add(new BigInteger(String.valueOf(nameValue * (i + 1))));
        }

        System.out.println(sum);
    }
}
