import java.time.*;
import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the date (yyyy-mm-dd) : ");
        String s = sc.nextLine();
        System.out.println("Enter no. of days : ");
        int days = sc.nextInt();
        sc.nextLine();
        System.out.println("add/subtract");
        String answer = sc.nextLine();

        System.out.println("Enter no. of months : ");
        int months = sc.nextInt();
        sc.nextLine();
        System.out.println("add/subtract");
        String answer1 = sc.nextLine();

        System.out.println("Enter no. of years : ");
        int years = sc.nextInt();
        sc.nextLine();
        System.out.println("add/subtract");
        String answer2 = sc.nextLine();

        LocalDate d = LocalDate.parse(s);
        if (answer.equalsIgnoreCase("add")) {
            d = d.plusDays(days);
        } else {
            d = d.minusDays(days);
        }
        if (answer1.equalsIgnoreCase("add")) {
            d = d.plusMonths(months);
        } else {
            d = d.minusMonths(months);
        }
        if (answer2.equalsIgnoreCase("add")) {
            d = d.plusYears(years);
        } else {
            d = d.minusYears(years);
        }
        System.out.println("Modified date is: " + d);

    }
}
