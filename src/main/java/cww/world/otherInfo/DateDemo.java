package cww.world.otherInfo;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

public class DateDemo {
    public static void main(String[] args) {
        //date to localDate
        Date date = new Date();

        LocalDate localDate = date.toInstant()
                .atZone(ZoneId.systemDefault())
                .toLocalDate();

        LocalDate now = LocalDate.now();
        LocalDate of = LocalDate.of(2019, 3, 1);

        //比较
        localDate.isAfter(now);

        //
        System.out.println(date);
//        DateUtils.addHours(localDate,localDate.get)
        long time = date.getTime();
        System.out.println(date);

    }
}
