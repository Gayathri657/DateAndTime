import java.time.*;
import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Date of Birth (yyyy-mm-dd) : ");
        String s = sc.nextLine();

        LocalDate birthDate = LocalDate.parse(s);
        DayOfWeek dayOfWeek = birthDate.getDayOfWeek();
        boolean isLeapYear = birthDate.isLeapYear();
        // int currentYear = LocalDate.now().getYear();
        // int birthYear = birthDate.getYear();
        // int age = currentYear - birthYear;
        LocalDate current = LocalDate.now();
        Period age = Period.between(current, birthDate);

        System.out.println("Day of the week you were born is : " + dayOfWeek);
        System.out.println("Is your orn year a leap year: " + isLeapYear);
        System.out.println("Your age is " + age);

    }

}
