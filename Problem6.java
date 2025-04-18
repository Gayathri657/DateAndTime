import java.time.*;
import java.util.Scanner;

public class Problem6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Birthday date (yyyy-mm-dd): ");
        LocalDate d = LocalDate.parse(sc.nextLine());
        LocalDate n = LocalDate.now();
        LocalDate modified = d.withYear(n.getYear());
        if (modified.isBefore(n) || modified.isEqual(n)) {
            System.out.println("Belated Happy Birthday");
            modified = modified.plusYears(1);
        }
        long days = Math.abs(Duration.between(modified.atStartOfDay(), n.atStartOfDay()).toDays());
        System.out.printf("%d Days left till your Birthday!!!Advance Happy Birthday!!!", days);

    }
}
