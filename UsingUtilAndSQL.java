
//these classes are depricated and joda has given an API for date and time so we use that from java 8 onwards
import java.util.Date;

public class UsingUtilAndSQL {
    public static void main(String[] args) {
        java.util.Date d = new java.util.Date();
        System.out.println(d);
        System.out.println(d.getDate());
        long time = d.getTime();
        java.sql.Date d1 = new java.sql.Date(time);
        System.out.println(d1);

    }
}