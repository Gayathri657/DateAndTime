import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Problem8 {

    public static void main(String[] args) {
        LocalDate d = LocalDate.now();
        DateTimeFormatter pattern = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String formatted = d.format(pattern);
        System.out.printf("Local date in pattern(dd-MM-yyyy) is %s", formatted);
        DateTimeFormatter pattern1 = DateTimeFormatter.ofPattern("EEEE, MMM dd, yyyy");
        String formatted1 = d.format(pattern1);
        System.out.println();
        System.out.printf("Local date in pattern(EEEE, MMM dd, yyyy) is %s", formatted1);

    }
}
