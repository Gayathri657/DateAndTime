import java.text.DateFormat;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Problem12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String date = sc.nextLine();
        String modified = date.replaceAll("(\\d{1,2})(st|nd|rd|th)", "$1");
        DateTimeFormatter f = DateTimeFormatter.ofPattern("dd-MMMM-yyyy");
        System.out.println(LocalDate.parse(modified, f));

    }
}
