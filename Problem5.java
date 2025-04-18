import java.time.*;
import java.util.Scanner;

public class Problem5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter times to Compare");
        System.out.println("Enter time 1(hh:mm:ss)  ");
        LocalTime s = LocalTime.parse(sc.nextLine());
        System.out.println("Enter time 2(hh:mm:ss) ");
        LocalTime t = LocalTime.parse(sc.nextLine());
        Duration d = Duration.between(s, t);
        long tseconds = d.getSeconds();
        long hours = (tseconds / 3600);
        long remainingSeconds = tseconds % 3600;
        long minutes = remainingSeconds / 60;
        long seconds = remainingSeconds % 60;
        System.out.printf("The difference is %d hours, %d minutes, %d seconds", hours, minutes, seconds);
    }
}
