package problem9;

public class Problem9 {
    public static void main(String[] args) {
        for (int i = 1; i < 1000; i++) {
            for (int j = i + 1; j < 1000; j++) {
                for (int k = j + 1; k < 1000; k++) {
                    if (i + j + k == 1000 && i * i + j * j == k * k) {
                        System.out.println(i * j * k);
                    }
                }
            }
        }
    }
}
