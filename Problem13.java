import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

public class Problem13 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        int count = 0;
        int months = 12;
        while (count < 6 && months > 0) {
            LocalDate first = date.withDayOfMonth(1);
            LocalDate secondF = first.with(TemporalAdjusters.dayOfWeekInMonth(2, DayOfWeek.FRIDAY));
            System.out.println(secondF);
            count++;
            date = date.plusMonths(1);
            months--;
        }

    }
}
