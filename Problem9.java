import java.time.*;
import java.time.ZoneId;

public class Problem9 {
    public static void main(String[] args) {
        ZoneId newyork = ZoneId.of("America/New_York");
        ZoneId kolkata = ZoneId.of("Asia/Kolkata");
        ZonedDateTime t = ZonedDateTime.now(newyork);
        ZonedDateTime t1 = ZonedDateTime.now(kolkata);
        LocalTime newyorkTime = t.toLocalTime();
        LocalTime kolkataTime = t1.toLocalTime();
        System.out.println("Newyork Time is " + newyorkTime);
        System.out.println("Kolkata Time is " + kolkataTime);
        Duration d = Duration.between(newyorkTime, kolkataTime);
        long seconds = d.toSeconds();
        System.out.println(newyorkTime.plusSeconds(seconds));
    }
}
