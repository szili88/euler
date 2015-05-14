package problem18;

public class Problem18 {
    private static final String RAW_INPUT = "75\n" +
            "95 64\n" +
            "17 47 82\n" +
            "18 35 87 10\n" +
            "20 04 82 47 65\n" +
            "19 01 23 75 03 34\n" +
            "88 02 77 73 07 63 67\n" +
            "99 65 04 28 06 16 70 92\n" +
            "41 41 26 56 83 40 80 70 33\n" +
            "41 48 72 33 47 32 37 16 94 29\n" +
            "53 71 44 65 25 43 91 52 97 51 14\n" +
            "70 11 33 28 77 73 17 78 39 68 17 57\n" +
            "91 71 52 38 17 14 91 43 58 50 27 29 48\n" +
            "63 66 04 68 89 53 67 30 73 16 69 87 40 31\n" +
            "04 62 98 27 23 09 70 98 73 93 38 53 60 04 23";

    private static long largestSum = 0;
    private static int[][] input;

    public static void main(String[] args) {
        String[] rows = RAW_INPUT.split("\n");
        input = new int[rows.length][];
        for (int i = 0; i < rows.length; i++) {
            String[] elements = rows[i].split(" ");
            input[i] = new int[elements.length];
            for (int j = 0; j < elements.length; j++) {
                input[i][j] = Integer.parseInt(elements[j]);
            }
        }

        computeLargestSum(0, 0, 0);
        System.out.println(largestSum);
    }

    private static void computeLargestSum(int row, int column, long currentSum) {
        if (row == input.length) {
            if (currentSum > largestSum) {
                largestSum = currentSum;
            }
        } else {
            computeLargestSum(row + 1, column, currentSum + input[row][column]);
            computeLargestSum(row + 1, column + 1, currentSum + input[row][column]);
        }
    }
}
