package cww.world;

import org.apache.commons.lang.time.DateUtils;

import java.util.Calendar;
import java.util.Date;

public class Test3 {

    public static void main(String[] args) {
        Date date = new Date();
        Date truncate = DateUtils.truncate(date, Calendar.MONTH);
        System.out.println(date.toString());

    }
}
