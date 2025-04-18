import java.time.*;
import java.util.Scanner;

public class Problem10 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the year : ");
        int year = sc.nextInt();
        System.out.println("Enter the month : ");
        int month = sc.nextInt();
        YearMonth y = YearMonth.of(year, month);
        int days = y.lengthOfMonth();
        for (int i = 1; i <= days; i++) {
            LocalDate t = LocalDate.of(year, month, i);
            if (t.getDayOfWeek().equals(DayOfWeek.FRIDAY)) {
                System.out.println(t);
            }
        }

    }
}
