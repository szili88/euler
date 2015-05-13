package problem5;

import java.util.HashMap;
import java.util.Map;

public class Problem5 {
    public static void main(String[] args) {
        Map<Integer, Integer> resultsMap = new HashMap<>();
        for (int i = 1; i <= 20; i++) {
            Map<Integer, Integer> currentResultMap = new HashMap<>();
            int numberToDivide = i;
            for (int j = 2; j <= i; j++) {
                int divisionTimes = 0;
                while (numberToDivide % j == 0) {
                    numberToDivide /= j;
                    divisionTimes++;
                }

                if (divisionTimes > 0) {
                    currentResultMap.put(j, divisionTimes);
                }
            }

            for (Map.Entry<Integer,Integer> entry : currentResultMap.entrySet()) {
                resultsMap.merge(entry.getKey(), entry.getValue(), (oldValue, newValue) -> oldValue > newValue ? oldValue : newValue);
            }
        }

        long result = 1;
        for (Map.Entry<Integer, Integer> entry : resultsMap.entrySet()) {
            result *= Math.pow(entry.getKey(), entry.getValue());
        }

        System.out.println(result);
    }
}
