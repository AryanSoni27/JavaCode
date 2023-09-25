package Com.Company;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class calendar_class {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        //System.out.println(c.getCalendarType());
        //System.out.println(c.getTimeZone());
//        System.out.println(c.get(Calendar.HOUR));
//        System.out.println(c.get(Calendar.HOUR_OF_DAY));
//        System.out.println(c.get(Calendar.DATE));
//        System.out.println(c.get(Calendar.DAY_OF_MONTH));
//        System.out.println(c.get(Calendar.DAY_OF_YEAR));

        //Calendar c = Calendar.getInstance(TimeZone.getTimeZone("GMT/UTC"));
        //System.out.println(c.getCalendarType());
        //System.out.println(c.getTimeZone());
        //System.out.println(c.get(Calendar.HOUR));

        GregorianCalendar cal = new GregorianCalendar();
        System.out.println(cal.isLeapYear(2020));


    }
}
