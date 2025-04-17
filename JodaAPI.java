// we can't create an object here 

import java.time.*;

public class JodaAPI {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        System.out.println(date);
        LocalTime time = LocalTime.now();
        System.out.println(time);
        int dayOfMonth = date.getDayOfMonth();
        int m = date.getMonthValue();
        int year = date.getYear();

        System.out.println("Date : " + dayOfMonth + "/" + m + "/" + year);

    }
}
