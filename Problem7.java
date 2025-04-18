import java.util.Scanner;
import java.time.*;
import java.time.format.DateTimeFormatter;

public class Problem7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the appoinment time(hh:mm a)");
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("hh:mm a");
        LocalTime t = LocalTime.parse(sc.nextLine(), formatter);
        LocalTime start = LocalTime.of(9, 0);
        LocalTime end = LocalTime.of(17, 0);
        if (!t.isBefore(start) && !t.isAfter(end)) {
            System.out.println("The appointment time is within working hours");
        } else {
            System.out.println("The appointment time is outside the working hours");
        }

    }
}
