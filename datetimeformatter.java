package Com.Company;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class datetimeformatter {
    public static void main(String[] args) {
        LocalDateTime dt = LocalDateTime.now(); //This is the date
        System.out.println(dt);

        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd-MM-yyyy"); //This is Formatter

        String myDate = dt.format(df);
        System.out.println(myDate);
    }
}
