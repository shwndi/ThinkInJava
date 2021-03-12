package GZQ.Arrays;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 * @author czy
 * @date 2021/2/25
 */
public class DateTest {
    public static void main(String[] args) {
        List<String> list = getBetweenDate("2013-12-01", "2014-02-01");
        for (String date : list) {
            System.out.println(date);
        }
    }

    public static List<String> getBetweenDate(String begin, String end) {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        List<String> betweenList = new ArrayList<String>();

        try {
            Calendar startDay = Calendar.getInstance();
            startDay.setTime(format.parse(begin));
            startDay.add(Calendar.DATE, 0);

            while (true) {
                startDay.add(Calendar.DATE, 1);
                Date newDate = startDay.getTime();
                String newend = format.format(newDate);
                betweenList.add(newend);
                if (end.equals(newend)) {
                    break;
                }

            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return betweenList;
    }
}
