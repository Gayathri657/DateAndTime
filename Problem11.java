import java.time.*;
import java.util.Scanner;

public class Problem11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter date 1 : ");
        String s = sc.nextLine();
        LocalDate d1 = LocalDate.parse(s);
        System.out.println("Enter date 2 : ");
        String s1 = sc.nextLine();
        LocalDate d2 = LocalDate.parse(s1);
        if (d1.isAfter(d2)) {
            LocalDate temp = d1;
            d1 = d2;
            d2 = temp;
        }
        long workingdays = 0;
        // for (LocalDate d = d1; !(d.isAfter(d2)); d = d.plusDays(1)) {
        // DayOfWeek week = d.getDayOfWeek();
        // if (!(week.equals(DayOfWeek.SATURDAY) || week.equals(DayOfWeek.SUNDAY))) {
        // workingdays++;
        // }
        // }

        workingdays = d1.datesUntil(d2.plusDays(1)).filter(
                d -> (!(d.getDayOfWeek().equals(DayOfWeek.SATURDAY) || d.getDayOfWeek().equals(DayOfWeek.SUNDAY))))
                .count();
        System.out.println(workingdays);
    }
}
