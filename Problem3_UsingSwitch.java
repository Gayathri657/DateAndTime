import java.time.LocalDate;
import java.util.Scanner;

public class Problem3_UsingSwitch {
    public static LocalDate modifyDate(Scanner sc, LocalDate d, String unit) {
        System.out.printf("Enter no. of %s : ", unit);
        int value = sc.nextInt();
        sc.nextLine();
        System.out.print("add/subtract: ");
        String action = sc.nextLine();
        switch (unit) {
            case "days":
                return action.equalsIgnoreCase("add") ? d.plusDays(value) : d.minusDays(value);
            case "months":
                return action.equalsIgnoreCase("add") ? d.plusMonths(value) : d.minusMonths(value);
            case "years":
                return action.equalsIgnoreCase("add") ? d.plusYears(value) : d.minusYears(value);
            default:
                System.out.println("Invalid Input");
                return d;
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the date (yyyy-mm-dd): ");
        String date = sc.nextLine();
        LocalDate d = LocalDate.parse(date);

        d = modifyDate(sc, d, "days");
        d = modifyDate(sc, d, "months");
        d = modifyDate(sc, d, "years");
        System.out.println("Modified date is " + d);

    }
}
