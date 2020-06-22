package _09_automated_testing_tdd.next_day;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class NextDayCalculator {
    public static String nextDay(String date) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Date dateNow;
        Calendar calendar = Calendar.getInstance();
        try {
            dateNow = sdf.parse(date);
            calendar.setTime(dateNow);
        } catch (Exception e) {
            System.exit(0);
        }
        calendar.add(Calendar.DATE, 1);
        return sdf.format(calendar.getTime());
    }
}
