import lombok.NonNull;

import java.time.ZoneId;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class DateTest {
    public static void main(String[] args) {
        Date date=null;
        for (int i = 0; i <=30 ; i++) {
             date = new GregorianCalendar(2024, Calendar.AUGUST, i).getTime();
            String da= getDayOfMonthOrdinalIndicator(date);
            System.out.println(da);
        }



    }

    public static String getDayOfMonthOrdinalIndicator(@NonNull final Date date) {

        if (date == null) {
            return null;
        }
        java.time.LocalDate targetDate =
                date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        int number = targetDate.getDayOfMonth();
        switch (number) {
            case 11:
            case 12:
            case 13:
                return number + "th";
        }
        switch (number % 10) {
            case 1:
                return number + "st";
            case 2:
                return number + "nd";
            case 3:
                return number + "rd";
            default:
                return number + "th";
        }
    }
}
