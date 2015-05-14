package problem19;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;

public class Problem19 {
    public static void main(String[] args) {
        int result = 0;
        LocalDate current = LocalDate.of(1901, Month.JANUARY, 1);
        LocalDate end = LocalDate.of (2000, Month.DECEMBER, 31);
        while (current.isBefore(end)) {
            if (current.getDayOfWeek().equals(DayOfWeek.SUNDAY)) {
                result++;
            }
            current = current.plusMonths(1);
        }
        System.out.println(result);
    }
}
