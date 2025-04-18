import java.util.Scanner;
import java.time.*;

public class Problem4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter dates to compare: ");
        System.out.println("Enter Date 1 (yyyy-mm-dd): ");
        LocalDate Date1 = LocalDate.parse(sc.nextLine());
        System.out.println("Enter Date 2 (yyyy-mm-dd): ");
        LocalDate Date2 = LocalDate.parse(sc.nextLine());
        if (Date1.equals(Date2)) {
            System.out.println("Both dates are equal");
        } else if (Date1.isBefore(Date2)) {
            System.out.println(Date1 + " is before " + Date2);
        } else {
            System.out.println(Date1 + " is after " + Date2);
        }

    }
}
